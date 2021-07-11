public  Samurai extends human{
private static samurainum=0 ;
public  Samurai(){
this.health=200
samurainum+=1;

}
public deathblow(human h){
h.human=0;
this.health=this.health/2;

}
public Mediate(){
this.health+=this.health*2;


}
public howmany(){
return Samurai.SamuraiNum;

}





}