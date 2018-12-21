package controle.musica;
import org.jfugue.Player;
import org.jfugue.Pattern;

public class Tocador 
{
	
	private String string_musical;
        private Player player = new Player();
        private Pattern pattern = new Pattern();
	
	public Tocador() 
	{
            
	}
	
        public void set_Pattern(String musica)
        {
            this.pattern = new Pattern(musica);
        }
        
	public void toca_Musica() 
	{   
            this.player.play(pattern);            
	}
        
        public void pausa_Musica()
        {
            this.player.pause();
        }
        
        public void resume_Musica()
        {   
          if(this.player.isPaused())  
            { this.player.resume(); }
        }
        
        public void parar_Musica()
        {
            this.player.stop();
        }
        
        public boolean estado()
        {
            return player.isPaused();
        }
}