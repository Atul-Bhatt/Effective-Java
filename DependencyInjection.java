import java.util.Objects;

public class DependencyInjection {
    private final Dependency dependency;

    public DependencyInjection(Dependency dependency) {
        this.dependency = Objects.requireNonNull(dependency);
    }

    public boolean firstMethod() {

    }

    public List<String> secondmethod(String argument) {

    }
}
