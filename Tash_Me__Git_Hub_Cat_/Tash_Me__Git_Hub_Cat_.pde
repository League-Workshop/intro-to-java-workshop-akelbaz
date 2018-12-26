PImage mustache;
PImage GitHubCat;
void setup(){
size(800,600);
GitHubCat=loadImage("Git Hub Cat.jpg");
GitHubCat.resize(800,600);
mustache=loadImage("MUSTACHE.png");
mustache.resize(400,300);}
void draw(){
background(GitHubCat);
image(mustache, mouseX, mouseY);}