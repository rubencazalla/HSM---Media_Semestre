/* criar um programa que permita calcular a m�dia semestral dos alunos.
 * A m�dia semestral � a m�dia aritm�tica simples das m�dias bimestrais. 
 * Bimestrais s�o compostas pelas seguintes atividades: 
 * prova (peso 3), 
 * projeto (peso 3), 
 * lista de exerc�cios (2) 
 * contribui��o em projetos de software livre/ conclus�o de MOOCs recomendados pelo docente (3).
 * exibir se o aluno foi aprovado ou reprovado
 * aluno deve ser aprovado se obtiver nota igual ou maior que 8
 * Caso o aluno tenha m�dia menor que 8, determine tamb�m a nota m�nima necess�ria para a pontua��o na prova final
 * Para tal, basta subtrair do valor 10,00 o valor da m�dia.
 */

import java.util.Scanner;

public class Media_Semestre {

	public static void main(String[] args) {
		int prova	  =	3;//peso
		int projeto   =	3;//peso
		int exercicio = 2;//peso
		int contrib	  = 3;//peso
		int x,y;
		int ncont=0;
		double nota1,nota2, nota3,nota4;
		double media1=0; 
		double media2=0; 
		double nSemestre1=0;
		double nSemestre2=0;
		double nfinal;
		
		Scanner dados = new  Scanner(System.in);
		System.out.println("Digite o Nome do Aluno");
		String nome = dados.nextLine();
		
		for(y=1;y<=2;y++) {
			System.out.println("=====================================================");
			System.out.println("          Notas do "+y+"� Semestre                   ");
			System.out.println("=====================================================");
			for(x=1;x<=2;x++){
				ncont=ncont+1;
				System.out.println("-------------->"+ncont+"� Bimestre<---------------");
				System.out.println("Digite a Nota da Prova  ");
				nota1= dados.nextDouble();
				System.out.println("Digite a Nota do Projeto");
				nota2= dados.nextDouble();
				System.out.println("Digite a Nota do Exercicio");
				nota3= dados.nextDouble();
				System.out.println("Digite a Nota do contribui��o");
				nota4= dados.nextDouble();	
				if(x==1){
					media1= ((nota1*prova)+(nota2*projeto)+(nota3*exercicio)+(nota4*contrib))/(prova+projeto+exercicio+contrib);
				}else{
					media2 = ((nota1*prova)+(nota2*projeto)+(nota3*exercicio)+(nota4*contrib))/(prova+projeto+exercicio+contrib);
				}
				
				if(y==1){
					nSemestre1 = ((media1+media2)/2);
				}else {
					nSemestre2 = ((media1+media2)/2);
				}
				
			}
			
		}
		
		System.out.println("#####################################");
		System.out.println("# Media 1� Semestre: "+Math.round(nSemestre1* 100.0)/100.0);
		System.out.println("# Media 2� Semestre: "+Math.round(nSemestre2* 100.0)/100.0);
		System.out.println("#####################################");
		
		nfinal=((nSemestre1+nSemestre2)/2);
	
		
		if (nfinal >= 8){
			System.out.println("Aluno: "+nome+" - foi Aprovado");
		}else {
			
			System.out.println("Necessario para aprova��o: "+Math.round((10-nfinal)* 100.0)/100.0);
			System.out.println("Digite a Nota da Prova Final");
			nota1= dados.nextDouble();
			
			if(nota1>(10-nfinal)) {
				System.out.println("Aluno: "+nome+" - foi aprovado");
			}else {
				System.out.println("Aluno: "+nome+" - foi reprovado");
			}
		}

		dados.close();
	}

}
