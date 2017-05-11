package nekio.view.braingym.config;

import java.io.File;
import nekio.library.common.configuration.AppValues;
import nekio.library.common.configuration.Configurations;
import nekio.library.common.globals.Global;

public class Config extends AppValues{
    public Config(){
        Configurations configurations = new Configurations();
        
        configurations.setAppDeveloper("Nekio");
        configurations.setAppProjectName("Nekio.View.BrainGym");
        configurations.setAppName("BrainGym");
        configurations.setAppEdition("Beta");
        configurations.setAppVersion("1.0");
        configurations.setProjectFolder(System.getProperty("user.dir"));
        configurations.setConfigurationClassFolder(this.getClass().getPackage().getName().replace(".", File.separator));
        //configurations.setLogFolder(System.getProperty("user.home") + Global.nameLogFolder("company", "project", "log"));
        configurations.setLogFolder(System.getProperty("user.home") + Global.SUGGESTED_LOG_FOLDER);
        configurations.setDebug(true);
        configurations.setDebugInConsole(true);
        configurations.setTimestampInLog(false);
        
        super.loadConfigurations(configurations);
    }
}
