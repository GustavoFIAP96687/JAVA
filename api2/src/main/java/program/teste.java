package program;

import java.io.IOException;
import java.util.*;


import model.perfil;
import service.GitHubService;


public class teste {


    public static void main(String[] args) {

    	Scanner ler = new Scanner(System.in);
    	GitHubService gitHubService = new GitHubService();
    	
    	String login;
        System.out.println("Digite seu perfil: ");
        login = ler.next();


        try {
			perfil perfil = gitHubService.getPerfil(login);
           
            
           
            System.out.println(perfil.getName() + "\n");
            System.out.println(perfil.getPublic_repos() + "\n");
            System.out.println(perfil.getFollowers() + "\n");
           
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }  
    }
}

