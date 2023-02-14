package com.github.dhslrl321;

import static com.github.dhslrl321.Abc.*;
import static com.github.dhslrl321.Result.*;

public class Referee {
    public Result judge(Abc first, Abc second) {
        // TODO 여기 리팩토링서부터 다시 시작 maybe handler?
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
