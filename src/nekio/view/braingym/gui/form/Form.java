package nekio.view.braingym.gui.form;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import nekio.library.common.contract.IFrame;
import nekio.library.common.globals.Global;
import nekio.view.braingym.config.Config;
import nekio.view.braingym.gui.panel.TextPanel;

public class Form extends IFrame{    
    public Form(Config config){
        super(config);
    }
    
    @Override
    protected void activate() {
        this.setTitle(Global.APP_NAME);
        this.setLayout(new BorderLayout());
        this.setSize(new Dimension(600, 400));
        this.setLocationRelativeTo(null);
    }
    
    @Override
    protected void addComponents() {
        this.add(super.panelLoader(TextPanel.class), BorderLayout.CENTER);
    }

    @Override
    protected void addListeners() {
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent evt) {
                exit(this.toString());
            }
        });
    }

    @Override
    protected void initialize() {
    }
}
