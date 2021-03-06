package jakarta.enterprise.inject.build.compatible.spi;

import jakarta.enterprise.lang.model.AnnotationAttribute;
import jakarta.enterprise.lang.model.AnnotationInfo;
import jakarta.enterprise.lang.model.declarations.ClassInfo;
import java.lang.annotation.Annotation;
import java.util.function.Predicate;

// TODO better name?
// TODO devise a builder-style API instead (see also Annotations)
public interface AnnotationConfig {
    void addAnnotation(Class<? extends Annotation> annotationType, AnnotationAttribute... attributes);

    void addAnnotation(ClassInfo<?> annotationType, AnnotationAttribute... attributes);

    void addAnnotation(AnnotationInfo annotation);

    void addAnnotation(Annotation annotation);

    void removeAnnotation(Predicate<AnnotationInfo> predicate);

    void removeAllAnnotations();
}
