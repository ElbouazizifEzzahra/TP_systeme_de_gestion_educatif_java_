package phase1.service;
import phase1.modele.Enseignant;
import phase1.modele.Filiere;
import phase1.modele.Module;

import java.util.ArrayList;
public class ServicesModule {





        public static Module addModule(String intitule, Enseignant chef,  Filiere filiere) {
            Module module = new Module();
            module.setIntitule(intitule);
            module.setChef(chef);
            module.setFiliere(filiere);
            module.setId(BD.getETDID());
            BD.modules.add(module);
            return module;

        }


        public static Module updateModule(int id , String intitule, Enseignant chef,  Filiere filiere){
            for( Module module :BD.modules) {
                if(module.getId()==id){
                    module.setIntitule(intitule);
                    module.setChef(chef);
                    return module;

                }}

            return new Module();
        }
        public static ArrayList<Module> deleteModuleById(int id){
                BD.modules.remove(getModuleById(id));
                return  BD.modules;
        }

        public static Module getModuleById(int id){
            for(Module module : BD.modules){
            if(module.getId()==id){
                return module;
            }
        }

            return  new Module();
        }

        public static ArrayList<Module> getAllModule(){
            return  BD.modules;
        }
    }

