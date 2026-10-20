package Forca;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import Forca.services.LimpaTela;

public class Boneco {
    public Boneco(){
        
    }
    private int partes = 6;
    
    public int getPartes() {
    	return partes;
    }

    public void MostrarBoneco() throws InterruptedException, IOException{
        
        switch (partes) {
        case 6:
        	System.out.println("""
                    yeah       
              \\    /          
               \\0          
                |\\_    
                |          
               / \\        
             _/   \\_
               """);break;
    	case 5: 
    		LimpaTela.limparConsole();
    		System.out.println("""
    			    	ouch, my arm!!       
    		           /          
    		         0          
    		         |\\_    
    		         |          
    		        / \\        
    		      _/   \\_
    		        """); break;

    	case 4:
    		LimpaTela.limparConsole();
    		System.out.println("""
    			    	NOOOOOO!!       
    		           /          
    		         0          
    		         |  
    		         |          
    		        / \\        
    		      _/   \\_
    		        """); break;
    	case 3:
    		LimpaTela.limparConsole();
    		System.out.println("""
    			    	MY LEGGGG!!       
    		           /          
    		         0          
    		         |  
    		         |          
    		          \\        
    		           \\_
    		        """); break;
    	case 2:
    		LimpaTela.limparConsole();
    		System.out.println("""
    			    	NOOOO IM A WORMMMM!!       
    		           /          
    		         0          
    		         |  
    		         |          
    		         
    		        """); break;
    	case 1:
    		LimpaTela.limparConsole();
    		System.out.println("""
    			    	NOW THERE IS ONLY MY HEAAAD!!       
    		           /          
    		         0          
    		         
    		                  
    		         
    		        """); break;
    	case 0:
    		LimpaTela.limparConsole();
    		System.out.println("""        
    		         I've died      
    		           /
    		                      		         
    		        """); break;
    	}
    }
    
    public int DiminuirBoneco() throws InterruptedException, IOException {
    	partes--;
    	switch (partes) {
    	case 5: 
    		LimpaTela.limparConsole();
    		System.out.println("""
    			    	ouch, my arm!!       
    		           /          
    		         0          
    		         |\\_    
    		         |          
    		        / \\        
    		      _/   \\_
    		        """); 
    		System.out.println("seu");
    		TimeUnit.MILLISECONDS.sleep(500);
    		System.out.println("boneco");
    		TimeUnit.MILLISECONDS.sleep(500);
    		System.out.println("se machucou");
    		TimeUnit.MILLISECONDS.sleep(500);
    		System.out.println("tome");
    		TimeUnit.MILLISECONDS.sleep(500);
    		System.out.println("mais");
    		TimeUnit.MILLISECONDS.sleep(500);
    		System.out.println("cuidado!");
    		TimeUnit.MILLISECONDS.sleep(500);

    		break;

    	case 4:
    		LimpaTela.limparConsole();
    		System.out.println("""
    			    	NOOOOOO!!       
    		           /          
    		         0          
    		         |  
    		         |          
    		        / \\        
    		      _/   \\_
    		        """); System.out.println("seu");
    	    		TimeUnit.MILLISECONDS.sleep(500);
    	    		System.out.println("boneco");
    	    		TimeUnit.MILLISECONDS.sleep(500);
    	    		System.out.println("se machucou");
    	    		TimeUnit.MILLISECONDS.sleep(500);
    	    		System.out.println("tome");
    	    		TimeUnit.MILLISECONDS.sleep(500);
    	    		System.out.println("mais");
    	    		TimeUnit.MILLISECONDS.sleep(500);
    	    		System.out.println("cuidado!");
    	    		TimeUnit.MILLISECONDS.sleep(500);

    	    		break;
    	case 3:
    		LimpaTela.limparConsole();
    		System.out.println("""
    			    	MY LEGGGG!!       
    		           /          
    		         0          
    		         |  
    		         |          
    		          \\        
    		           \\_
    		        """); System.out.println("seu");
    	    		TimeUnit.MILLISECONDS.sleep(500);
    	    		System.out.println("boneco");
    	    		TimeUnit.MILLISECONDS.sleep(500);
    	    		System.out.println("se machucou");
    	    		TimeUnit.MILLISECONDS.sleep(500);
    	    		System.out.println("tome");
    	    		TimeUnit.MILLISECONDS.sleep(500);
    	    		System.out.println("mais");
    	    		TimeUnit.MILLISECONDS.sleep(500);
    	    		System.out.println("cuidado!");
    	    		TimeUnit.MILLISECONDS.sleep(500);
    	    		break;
    	case 2:
    		LimpaTela.limparConsole();
    		System.out.println("""
    			    	NOOOO IM A WORMMMM!!       
    		           /          
    		         0          
    		         |  
    		         |          
    		         
    		        """); System.out.println("seu");
    	    		TimeUnit.MILLISECONDS.sleep(500);
    	    		System.out.println("boneco");
    	    		TimeUnit.MILLISECONDS.sleep(500);
    	    		System.out.println("se machucou");
    	    		TimeUnit.MILLISECONDS.sleep(500);
    	    		System.out.println("tome");
    	    		TimeUnit.MILLISECONDS.sleep(500);
    	    		System.out.println("mais");
    	    		TimeUnit.MILLISECONDS.sleep(500);
    	    		System.out.println("cuidado!");
    	    		TimeUnit.MILLISECONDS.sleep(500);
    	    		break;
    	case 1:
    		LimpaTela.limparConsole();
    		System.out.println("""
    			    	NOW THERE IS ONLY MY HEAAAD!!       
    		           /          
    		         0          
    		         
    		                  
    		         
    		        """); System.out.println("seu");
    	    		TimeUnit.MILLISECONDS.sleep(500);
    	    		System.out.println("boneco");
    	    		TimeUnit.MILLISECONDS.sleep(500);
    	    		System.out.println("se machucou");
    	    		TimeUnit.MILLISECONDS.sleep(500);
    	    		System.out.println("tome");
    	    		TimeUnit.MILLISECONDS.sleep(500);
    	    		System.out.println("mais");
    	    		TimeUnit.MILLISECONDS.sleep(500);
    	    		System.out.println("cuidado!");
    	    		break;
    	case 0:
    		LimpaTela.limparConsole();
    		System.out.println("""        
    		         I've died      
    		           /
    		                      		         
    		        """); System.out.println("seu");
    	    		TimeUnit.MILLISECONDS.sleep(500);
    	    		System.out.println("boneco");
    	    		TimeUnit.MILLISECONDS.sleep(500);
    	    		System.out.println("morreu");
    	    		TimeUnit.MILLISECONDS.sleep(500);
    	    		System.out.println("parabéns");
    	    		TimeUnit.MILLISECONDS.sleep(500);
    	    		break;
    	}
    	return partes;
    }
    
    public void MostrarBonecoVitoria() throws InterruptedException, IOException {
    	switch (partes) {
    	case 6:
    		 System.out.println("""
    	             THANK YOUU      
    	       \\    /          
    	        \\0          
    	         |\\_    
    	         |          
    	        / \\        
    	      _/   \\_
    	        """);
      		TimeUnit.MILLISECONDS.sleep(800);
    		 System.out.println("Parabéns");
     		TimeUnit.MILLISECONDS.sleep(500);
     		System.out.println("seu boneco");
     		TimeUnit.MILLISECONDS.sleep(500);
     		System.out.println("sobreviveu");
     		TimeUnit.MILLISECONDS.sleep(500);
     		System.out.println("sem nenhum arranhão");
     		break;
    	case 5: 
    		System.out.println("""
    			    	THANK YOUU!!       
    		           /          
    		         0          
    		         |\\_    
    		         |          
    		        / \\        
    		      _/   \\_
    		        """); 
    		TimeUnit.MILLISECONDS.sleep(800);
   		 System.out.println("Parabéns");
    		TimeUnit.MILLISECONDS.sleep(500);
    		System.out.println("seu boneco");
    		TimeUnit.MILLISECONDS.sleep(500);
    		System.out.println("sobreviveu");
    		TimeUnit.MILLISECONDS.sleep(500);
    		System.out.println("com algumas ressalvas!");
    		break;

    	case 4:
    		System.out.println("""
    			    	THANK YOUU!!       
    		           /          
    		         0          
    		         |  
    		         |          
    		        / \\        
    		      _/   \\_
    		        """); TimeUnit.MILLISECONDS.sleep(800);
    	    		 System.out.println("Parabéns");
    	      		TimeUnit.MILLISECONDS.sleep(500);
    	      		System.out.println("seu boneco");
    	      		TimeUnit.MILLISECONDS.sleep(500);
    	      		System.out.println("sobreviveu");
    	     		TimeUnit.MILLISECONDS.sleep(500);
    	     		System.out.println("mas dava pra ser melhor!");
    	    		break;
    	case 3:
    		LimpaTela.limparConsole();
    		System.out.println("""
    			    	THANK YOUU!!       
    		           /          
    		         0          
    		         |  
    		         |          
    		          \\        
    		           \\_
    		        """); TimeUnit.MILLISECONDS.sleep(800);
    	    		 System.out.println("Eeh...");
    	      		TimeUnit.MILLISECONDS.sleep(700);
    	      		System.out.println("seu boneco");
    	      		TimeUnit.MILLISECONDS.sleep(500);
    	      		System.out.println("sobreviveu");
    	      		
    	    		break;
    	case 2:
    		System.out.println("""
    			    	THANKS!!       
    		           /          
    		         0          
    		         |  
    		         |          
    		         
    		        """); TimeUnit.MILLISECONDS.sleep(800);
    	    		 System.out.println("Ehh...");
    	      		TimeUnit.MILLISECONDS.sleep(700);
    	      		System.out.println("seu boneco");
    	      		TimeUnit.MILLISECONDS.sleep(500);
    	      		System.out.println("sobreviveu");
    	      		TimeUnit.MILLISECONDS.sleep(500);
    	      		System.out.println("Sem bracos e sem pernas");
    	    		break;
    	case 1:
    		System.out.println("""
    			    	NOW THERE IS ONLY MY HEAAAD!! BUT THANKS       
    		           /          
    		         0          
    		         
    		                  
    		         
    		        """); TimeUnit.MILLISECONDS.sleep(800);
    	    		 System.out.println("Essa");
    	      		TimeUnit.MILLISECONDS.sleep(500);
    	      		System.out.println("foi");
    	      		TimeUnit.MILLISECONDS.sleep(500);
    	      		System.out.println("por pouco!");
    	    		break;
    	}
    }
    
}