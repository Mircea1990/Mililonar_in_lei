package ro.jademy.milionar;

import java.util.Objects;

public class Anwers {
    //answer
    //boolean
    public String answer ;
    public boolean iscorrect;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Anwers anwers = (Anwers) o;
        return iscorrect == anwers.iscorrect &&
                Objects.equals(answer, anwers.answer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(answer, iscorrect);
    }
}
