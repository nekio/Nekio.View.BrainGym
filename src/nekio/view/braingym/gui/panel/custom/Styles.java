package nekio.view.braingym.gui.panel.custom;

import java.awt.Color;
import javax.swing.text.Style;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyleContext;


public class Styles {
    private StyleContext context;
    private Style mainStyle;
    private Style highlitedStyle;
    
    public Styles(){        
        load();
    }
    
    private void load(){
        context = new StyleContext();
        
        mainStyle = context.addStyle("main", context.getStyle(StyleContext.DEFAULT_STYLE));
        StyleConstants.setForeground(highlitedStyle, Color.BLACK);        
        StyleConstants.setFontFamily(mainStyle, "serif");
        StyleConstants.setFontSize(mainStyle, 12);
        StyleConstants.setLeftIndent(mainStyle, 16);
        StyleConstants.setRightIndent(mainStyle, 16);
        StyleConstants.setFirstLineIndent(mainStyle, 16);
            
        highlitedStyle = context.addStyle("highlited", null);
        StyleConstants.setForeground(highlitedStyle, Color.RED);
        StyleConstants.setFontFamily(highlitedStyle, "serif");
        StyleConstants.setFontSize(highlitedStyle, 12);
        StyleConstants.setBold(highlitedStyle, true);
        StyleConstants.setLeftIndent(highlitedStyle, 8);
        StyleConstants.setFirstLineIndent(highlitedStyle, 0);        
    }

    public StyleContext getContext() {
        return context;
    }
    
    public Style getMainStyle() {
        return mainStyle;
    }
    
    public Style getHighlitedStyle() {
        return highlitedStyle;
    }
}
