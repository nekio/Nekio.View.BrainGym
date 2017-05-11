package nekio.view.braingym.gui.panel;

import java.awt.Color;
import javax.swing.*;
import nekio.library.common.contract.IPanel;
import nekio.view.braingym.gui.panel.custom.ColoredTextPanel;

public class TextPanel extends IPanel{
    private ColoredTextPanel txtContent;
    private JButton btnOpen;
    private JSpinner spnSpeed;
    private JComboBox cmbFontSize;

    @Override
    protected void addComponents() {
        txtContent = new ColoredTextPanel(Integer.parseInt(super.properties.getFields().get("HighlithWord")), Color.BLACK);
        txtContent.append("La atmosfera era de esperanza y expectación de lo que Dios había hecho en el pasado, y lo que podía hacer en el presente y futuro. Tanto Mateo y Marcos nos dicen que ellos cantaron un Himno después de la institución de la Cena del Señor, Mat. 26:30; Mc. 14:26. Este Himno es en si una serie de Salmos definidos como Hallel que comienzan desde el Salmo 113 y terminan en el Salmo 118. Los temas que se tocan en esos Salmos son que Dios ayuda a los necesitados, las maravillas del Éxodo, como el Dios de Israel es más poderoso que los otros dioses, como Dios sana a los enfermos, un llamado universal a la adoración, y finalmente una canción de Victoria.¿Le suena esto como un tiempo de tristeza? La adoración, entonces, que se identifica con la Cena del Señor es una de alegría, agradecimiento, afirmación de la soberanía de Dios sobre la naturaleza, soberanía sobre los llamados “dioses”, y soberanía sobre TODO el universo. Eso es lo que Jesús y sus discípulos cantaron en la noche que Jesús instituyó la Santa Cena.");
        /*Font font = new Font(
                super.properties.getFields().get("FontName"),
                Font.ITALIC,
                Integer.parseInt(super.properties.getFields().get("FontSize"))
        );*/
        
        this.add(new JScrollPane(txtContent));
    }

    @Override
    protected void addListeners() {}

    @Override
    protected void initialize() {
    }
}
