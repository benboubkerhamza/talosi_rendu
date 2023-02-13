package talosi;

public class ThreeStack {


  private String tab[] =  new String[10];


public ThreeStack(){
  
}


/*public push(int nbr , String object)
{
  int taillepile = this.tab.length /3;
  for( int i=1 ; i<=3 ; i++ ){
    if ( nbr == i){
      for (int j=0 ; j< taillepile ; j++){
        int indice_dans_pile = (nbr-1)*(taillepile) + j;
        if ((this.tab[indice_dans_pile] == null)
        {
          (this.tab[indice_dans_pile] = object ;
        }
    }
  }
  }
    
}*/

public void  push(int nbr , String nom){
  int taillepile = this.tab.length /3;
  //System.out.println(taillepile);
  for (int j=0 ; j< taillepile ; j++)
  {
    int indice_dans_pile = ((nbr*taillepile)-taillepile + j);
    
    if (this.tab[indice_dans_pile] == null)
    {
      this.tab[indice_dans_pile] = nom ;
      //System.out.println(this.tab[0]);
      break;
    }
}
}



public  String  pop(int nbr)
{
  int taillepile = this.tab.length /3 ;
  String res = "";
  int j=1;
  while( j<4) {
	  for(int i = nbr*taillepile-j ;i>=0;i--)
	  { 
      if (this.tab[i] != null )
      {
        res = this.tab[i] ;
        this.tab[i] = null;
        return res ;
      }
      else j++;
  }
  }
return null;}



public String[] getTab() {
	return this.tab;
}
  
}









  

