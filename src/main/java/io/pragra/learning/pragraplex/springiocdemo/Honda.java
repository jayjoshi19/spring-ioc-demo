package io.pragra.learning.pragraplex.springiocdemo;

public class Honda {
    String engine;
    String name;
    IBrake brake;

    public Honda(String engine, String name, IBrake brake) {
        this.engine = engine;
        this.name = name;
        this.brake = brake;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Honda{");
        sb.append("engine='").append(engine).append('\'');
        sb.append(", name='").append(name).append('\'');
        sb.append(", brake=").append(brake);
        sb.append('}');
        return sb.toString();
    }
}
