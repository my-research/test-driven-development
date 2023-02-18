package com.github.dhslrl321;

import static com.github.dhslrl321.Hands.*;
import static com.github.dhslrl321.Result.*;
import static java.util.Objects.nonNull;
import static org.valid4j.Validation.validate;

public class Referee {
    public Result judge(Hands first, Hands second) {

        validate(nonNull(first) && nonNull(second), IllegalArgumentException.class);

        if (ROCK.equals(first)) {
            if (PAPER.equals(second)) return LOOSE;
            else if (ROCK.equals(second)) return DRAW;
        } else if (SCISSORS.equals(first)) {
            if (ROCK.equals(second)) return LOOSE;
            else if (PAPER.equals(second)) return WIN;
            else if (SCISSORS.equals(second)) return DRAW;
        } else if (PAPER.equals(first)) {
            if (ROCK.equals(second)) return WIN;
            else if (SCISSORS.equals(second)) return LOOSE;
            else if (PAPER.equals(second)) return DRAW;
        }
        return WIN;
    }
}
