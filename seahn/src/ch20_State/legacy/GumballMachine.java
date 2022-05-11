package ch20_State.legacy;

public class GumballMachine {
    final static int SOLD_OUT = 0; // 매진
    final static int NO_QUARTER = 1; // 동전 없음
    final static int HAS_QUARTER = 2; // 동전 있음
    final static int SOLD = 3; //판매

    int state = SOLD_OUT;
    int count = 0;

    public GumballMachine(int count) {
        this.count = count;
        if (count > 0) {
            state = NO_QUARTER;
        }
    }

    //동전 삽입
    public void insertQuarter() {
        if (state == HAS_QUARTER) {
            System.out.println("동전은 한 개만 넣어주세요.");
        } else if (state == NO_QUARTER) {
            state = HAS_QUARTER;
            System.out.println("동전을 넣으셨습니다.");
        } else if (state == SOLD_OUT) {
            System.out.println("매진되었습니다. 다음 기회에 이용해주세요.");
        } else if (state == SOLD) {
            System.out.println("잠깐만 기다려 주세요. 알멩이가 나가고 있습니다.");
        }
    }

    //동전 반환
    public void ejectQuarter() {
        if (state == HAS_QUARTER) {
            System.out.println("동전이 반환됩니다.");
            state = NO_QUARTER;
        } else if (state == NO_QUARTER) {
            System.out.println("동전을 넣어주세요.");
        } else if (state == SOLD) {
            System.out.println("이미 알멩이를 뽑으셨습니다.");
        } else if (state == SOLD_OUT) {
            System.out.println("동전을 넣지 않으셨습니다. 동전이 반환되지 않습니다.");

        }
    }

    //손잡이 돌리기
    public void turnCrank() {
        if (state == SOLD) {
            System.out.println("손잡이는 한 번만 돌려주세요.");
        } else if (state == NO_QUARTER) {
            System.out.println("동전을 넣어주세요");
        } else if (state == SOLD_OUT) {
            System.out.println("매진되었습니다");
        } else if (state == HAS_QUARTER) {
            System.out.println("손잡이를 돌리셨습니다.");
            state = SOLD;
            dispense();
        }
    }

    public void dispense() {
        if (state == SOLD) {
            System.out.println("알멩이가 나가고 있습니다.");
            count = count - 1;
            if (count == 0) {
                System.out.println("더 이상 알멩이가 없습니다.");
                state = SOLD_OUT;
            } else {
                state = NO_QUARTER;
            }
        } else if (state == NO_QUARTER) {
            System.out.println("동전을 넣어주세요");
        } else if (state == SOLD_OUT) {
            System.out.println("매진입니다");
        } else if (state == HAS_QUARTER) {
            System.out.println("알멩이가 나갈 수 없습니다.");
        }
    }

    @Override
    public String toString() {
        return "GumballMachine{" +
                "state=" + state +
                ", count=" + count +
                '}';
    }
}
