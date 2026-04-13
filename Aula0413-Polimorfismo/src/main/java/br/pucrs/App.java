package br.pucrs;

public class App {
    public static void main(String[] args) {
        Pessoa vetor[] = new Pessoa[5];

        vetor[0] = new Pessoa("João", "123.456.789-00", "Rua A, 100");
        vetor[1] = new Aluno("Maria", "987.654.321-00", "Rua B, 200", "2021001");
        vetor[2] = new Funcionario("Carlos", "111.222.333-44", "Rua C, 300", "F001", 2500.00);
        vetor[3] = new Coordenador("Ana", "555.666.777-88", "Rua D, 400", "C001", 3500.00, "Engenharia de Software");   
        vetor[4] = new Professor("Pedro", "444.555.666-77", "Rua E, 500", "P001", 3000.00, "Computação");

        System.out.println("Imprimindo os objetos do vetor:");
        for (Pessoa p : vetor)
            System.out.println(p);

        System.out.println("Imprimindo os objetos de forma específica:");
        for (Pessoa p : vetor)
            especificaObjeto(p);
    }

    public static void especificaObjeto(Pessoa p) {

        System.out.println("\nInformações específicas do objeto:");
        System.out.println("Como pessoa eu informo nome: " + p.getNome());
        System.out.println("Mas eu posso ser interpretado de outras formas:");

        if (p instanceof Aluno) {            
            Aluno a = (Aluno) p;
            System.out.println("  Como aluno eu informo nome: " + a.getNome() + ", Matrícula: " + a.getMatricula());
        }
        if (p instanceof Coordenador) {
            Coordenador c = (Coordenador) p;
            System.out.println("  Como coordenador eu informo nome: " + c.getNome() + ", Curso: " + c.getCurso());
        }
        if (p instanceof Professor) {
            Professor pr = (Professor) p;
            System.out.println("  Como professor eu informo nome: " + pr.getNome() + ", Departamento: " + pr.getDepartamento());
        }
        if (p instanceof Funcionario) {
            Funcionario f = (Funcionario) p;
            System.out.println("  Como funcionário eu informo nome: " + f.getNome() + ", Código: " + f.getCodigo() + ", Salário: " + f.getSalario());
        } 
    }
}
