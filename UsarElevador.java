package questao2;
import java.util.Scanner;


public class UsarElevador {
  public static void main(String[] args) {
    int nOpc=-1, nTot, nCap, nAux;
    Scanner sLer = new Scanner(System.in);
      
    Elevador elev[]=new Elevador[1]; 
    
    elev[0]=new Elevador(0,0,0,0); 
      
  System.out.printf("Capacidade total? R: ");
    nCap=sLer.nextInt();
  System.out.printf("Quantos andares? R: ");
    nTot=sLer.nextInt();
    elev[0].Inicializa(nCap,nTot); 
    
    while(true){
      pintaMenu();
      nOpc = sLer.nextInt();
      if(nOpc==0)
        break; 
          
    System.out.printf("\n\n");
    switch (nOpc) {
      case 1:
    System.out.printf("Num de pessoas atualmente: ");
        nAux=sLer.nextInt();
      if(nAux<elev[0].getCapac())
        elev[0].setPessoa(nAux);
      break;
      case 2:
          
      if (elev[0].getAtual()<elev[0].getTotal())
        elev[0].Sobe();
      break;
      case 3:
          
      if (elev[0].getAtual()>0)
        elev[0].Desce();
      break;
      case 4:
        
      if (elev[0].getPess()<elev[0].getCapac())
        elev[0].Entra();
      break;
      case 5:
        
      if (elev[0].getPess()>0)
         elev[0].Sai();
      break;
      case 6:
      System.out.printf("Quantidade de Pessoas: %d\n",elev[0].getPess());
      System.out.printf("Capacidade Máxima: %d\n",elev[0].getCapac());
      System.out.printf("Andar Atual: %d\n",elev[0].getAtual());
      System.out.printf("Quantidade de Andares: %d\n",elev[0].getTotal());
         
      try { Thread.sleep (2000); }
      catch (InterruptedException ex) {}
      break;
      default:
      System.out.printf("\n --> Valor Incorreto <--");
      break;
        }
      }
      System.out.printf("\n\nSaiu do elevador\n\n");
      sLer.close();
    } 
    
    
    private static void pintaMenu(){
      System.out.printf("\n\n > Escolha uma ação ");
      System.out.printf("\n  1- Numero de pessoas ");
      System.out.printf("\n  2- Subir andar ");
      System.out.printf("\n  3- Desce ");
      System.out.printf("\n  4- Adicionar Pessoa ");
      System.out.printf("\n  5- Tirar Pessoa ");
      System.out.printf("\n  6- Mostrar informação atual ");
      System.out.printf("\n  0- Sair ");
      System.out.printf("\n > Resposta: ");
    }
  
}
