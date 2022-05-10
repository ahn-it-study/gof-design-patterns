package ch19_Observer.legacy;

import jdk.jfr.Unsigned;

import java.lang.annotation.Documented;

public class WeatherData {

    /**
     * 1. 측정값이 변경되면 관련된 정보 업데이트
     * 문제점
     * 1. 인터페이스를 사용하지 않고 구현체를 사용해서 추가 및 변경에 닫혀있다.
     * 2. 디스플레이 항목들을 공통적인 인터페이스가 없다.
     * 3. 새로운 디스플레이 항목이 추가될 때마다 코드를 변경해야한다.
     * 4. 바뀌는 부분을 캡슐화하지 않았다.
     * 5. 실행중에 디스플레이 항목을 추가/제거할 수 없다.
     */
    /*
        public void measurementsChanged() {
            float temp = getTemperature();
            float humidity = getHumidity();
            float pressure = getPressure();

            currentConditionDisplay.update();
            statisticsDisplay.update();
            forecastDisplay.update();
        }
    */
}
