/******************************************************************************
* I'm a fresh graduate student with software development skills and an        *
* outstanding academic record. My performance in the <em>SLASSCOM/Motorola    *
* Innovations Championship 2013</em>, Dialog IdeaMart Hackathon 2013 and      *
* Blackberry Developer Program demonstrate that my skills expand far beyond   *
* classroom! Am familiar with Java(SE/EE), Android and ASP.net/C# as well     *
* as following Agile and XP for development. More importantly, I posses the   *
* desire to expand my horizon learning new technologies and concepts.         *
******************************************************************************/
public class Resume<SoftwareDeveloper>{
  public static class Person implements TeamWorker, GoodPresenter{
    private String name = "Nibras Ahamed Reeza";
    private String email = "nibras@nibrasweb.com";
    private String phone = "94779966375";
    private String website = "http://www.nibrasweb.com"; // IMPORTANT!
  }

  public static enum Skill{
    JAVA(90),     ///////////////////////
    C_SHARP(60);  ///////////////

    private int skillPercentage;

    private Skill(int sP){
        this.skillPercentage = sP;
    }
  }
}
