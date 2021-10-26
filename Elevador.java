package questao2;

public class Elevador {
	private int nAtual, nTotal, nCapacidade, nPessoas; 
   

	public Elevador(int nA, int nT, int nC, int nP) {
	  this.nAtual = nA;
	  this.nTotal = nT;
	  this.nCapacidade = nC;
	  this.nPessoas = nP;
	} 

	public int Capac() {
	  return this.nCapacidade;}

	public int Pess() {
	  return this.nPessoas;}

	public int Total() {
	  return this.nTotal;}

	public int Atual() {
	  return this.nAtual;} 
   
	public void setPessoa(int nPe){
	  this.nPessoas = nPe;} 
   
	public void Inicializa(int nCap,int nTot){
	  this.nTotal   = nTot;
	  this.nCapacidade   = nCap;
	} 
   
	public void Entra(){
	  this.nPessoas+=1;
	} 
  
	public void Sai(){
	  this.nPessoas-=1;
	} 
   
	public void Sobe(){
	  this.nAtual+=1;
	} 
 
	public void Desce(){
	  this.nAtual-=1;
	} 
 }