package nekio.view.braingym.gui.panel.custom;

import java.awt.Color;
import javax.swing.JTextPane;
import javax.swing.text.*;
import nekio.library.common.log.Log;

public class ColoredTextPanel extends JTextPane {
    private Styles styles;
    private int highlithWord;
    private Color defaultColor;
    
    public ColoredTextPanel(int highlithWord, Color defaultColor){
        this.highlithWord = highlithWord;
        this.defaultColor = defaultColor;
        
        //this.styles = new Styles();
    }
    
    public void append(String text) {
        append(defaultColor, text, false, -1);
    }
    
    public void append(Color color, String text) {
        append(color, text, false, -1);
    }
    
    public void append(Color color, String text, boolean replace, int position) {
        try {
            StyleContext style = StyleContext.getDefaultStyleContext();
            //AttributeSet attribute = style.addAttribute(styles.getMainStyle(), StyleConstants.Foreground, color);
            AttributeSet attribute = style.addAttribute(SimpleAttributeSet.EMPTY, StyleConstants.Foreground, color);
            
            // Si se recibe la posicion -1, significa que se agregará el texto al final
        
            if(position == -1){
                position = getDocument().getLength();
                //setCharacterAttributes(styles.getMainStyle(), true);
            }else{
                getStyledDocument().remove(position, text.length());
                //setCharacterAttributes(styles.getHighlitedStyle(), true);
            }
            
            setCaretPosition(position);
            setCharacterAttributes(attribute, replace);
            replaceSelection(text);

            if(!replace)
                recolor();
        } catch (Exception e) {
            Log.e(e);
        }
    }
    
    private void recolor(){
        try {
            String content = this.getText();

            int whitespaces = 0;
            char currentChar;
            for(int i = 0; i < content.length(); i++){
                
                currentChar = content.charAt(i);
                if(currentChar == ' '){
                    whitespaces++;
                }
                    
                if(whitespaces % highlithWord == 0){
                    append(Color.RED, "" + currentChar, true, i);
                }
            }
        } catch (Exception e) {
            Log.e(e);
        }
    }
}
