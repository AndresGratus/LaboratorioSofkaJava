
package laboratorisofkajava;


public class Pregunta {
    String Question,OpcionA,OpcionB,OpcionC,OpcionD;
    String CorrectOpcion;
    
    public Pregunta(){
        
    }
    public Pregunta(String Question, String OpcionA, String OpcionB, String OpcionC, String OpcionD, String CorrectOpcion) {
        this.Question = Question;
        this.OpcionA = OpcionA;
        this.OpcionB = OpcionB;
        this.OpcionC = OpcionC;
        this.OpcionD = OpcionD;
        this.CorrectOpcion = CorrectOpcion;
    }

    public String getQuestion() {
        return Question;
    }

    public void setQuestion(String Question) {
        this.Question = Question;
    }

    public String getOpcionA() {
        return OpcionA;
    }

    public void setOpcionA(String OpcionA) {
        this.OpcionA = OpcionA;
    }

    public String getOpcionB() {
        return OpcionB;
    }

    public void setOpcionB(String OpcionB) {
        this.OpcionB = OpcionB;
    }

    public String getOpcionC() {
        return OpcionC;
    }

    public void setOpcionC(String OpcionC) {
        this.OpcionC = OpcionC;
    }

    public String getOpcionD() {
        return OpcionD;
    }

    public void setOpcionD(String OpcionD) {
        this.OpcionD = OpcionD;
    }

    public String getCorrectOpcion() {
        return CorrectOpcion;
    }

    public void setCorrectOpcion(String CorrectOpcion) {
        this.CorrectOpcion = CorrectOpcion;
    }

    @Override
    public String toString() {
        return "Pregunta{" + "Question=" + Question + ", OpcionA=" + OpcionA + ", OpcionB=" + OpcionB + ", OpcionC=" + OpcionC + ", OpcionD=" + OpcionD + ", CorrectOpcion=" + CorrectOpcion + '}';
    }
    
    
}
