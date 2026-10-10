package com.google.firebase.components;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class Component<T> {
    private final Set<Dependency> dependencies;
    private final ComponentFactory<T> factory;
    private final int instantiation;
    private final String name;
    private final Set<Qualified<? super T>> providedInterfaces;
    private final Set<Class<?>> publishedEvents;
    private final int type;

    public static class Builder<T> {
        private final Set<Dependency> dependencies;
        private ComponentFactory<T> factory;
        private int instantiation;
        private String name;
        private final Set<Qualified<? super T>> providedInterfaces;
        private final Set<Class<?>> publishedEvents;
        private int type;

        /* JADX INFO: Access modifiers changed from: private */
        @CanIgnoreReturnValue
        public Builder<T> intoSet() {
            this.type = 1;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder<T> alwaysEager() {
            return setInstantiation(1);
        }

        @CanIgnoreReturnValue
        public Builder<T> eagerInDefaultApp() {
            return setInstantiation(2);
        }

        @CanIgnoreReturnValue
        private Builder<T> setInstantiation(int i11) {
            Preconditions.checkState(this.instantiation == 0, "Instantiation type has already been set.");
            this.instantiation = i11;
            return this;
        }

        private void validateInterface(Qualified<?> qualified) {
            Preconditions.checkArgument(!this.providedInterfaces.contains(qualified), "Components are not allowed to depend on interfaces they themselves provide.");
        }

        @CanIgnoreReturnValue
        public Builder<T> add(Dependency dependency) {
            Preconditions.checkNotNull(dependency, "Null dependency");
            validateInterface(dependency.getInterface());
            this.dependencies.add(dependency);
            return this;
        }

        public Component<T> build() {
            Preconditions.checkState(this.factory != null, "Missing required property: factory.");
            return new Component<>(this.name, new HashSet(this.providedInterfaces), new HashSet(this.dependencies), this.instantiation, this.type, this.factory, this.publishedEvents);
        }

        @CanIgnoreReturnValue
        public Builder<T> factory(ComponentFactory<T> componentFactory) {
            this.factory = (ComponentFactory) Preconditions.checkNotNull(componentFactory, "Null factory");
            return this;
        }

        public Builder<T> name(@NonNull String str) {
            this.name = str;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder<T> publishes(Class<?> cls) {
            this.publishedEvents.add(cls);
            return this;
        }

        @SafeVarargs
        private Builder(Class<T> cls, Class<? super T>... clsArr) {
            this.name = null;
            HashSet hashSet = new HashSet();
            this.providedInterfaces = hashSet;
            this.dependencies = new HashSet();
            this.instantiation = 0;
            this.type = 0;
            this.publishedEvents = new HashSet();
            Preconditions.checkNotNull(cls, "Null interface");
            hashSet.add(Qualified.unqualified(cls));
            for (Class<? super T> cls2 : clsArr) {
                Preconditions.checkNotNull(cls2, "Null interface");
                this.providedInterfaces.add(Qualified.unqualified(cls2));
            }
        }

        @SafeVarargs
        private Builder(Qualified<T> qualified, Qualified<? super T>... qualifiedArr) {
            this.name = null;
            HashSet hashSet = new HashSet();
            this.providedInterfaces = hashSet;
            this.dependencies = new HashSet();
            this.instantiation = 0;
            this.type = 0;
            this.publishedEvents = new HashSet();
            Preconditions.checkNotNull(qualified, "Null interface");
            hashSet.add(qualified);
            for (Qualified<? super T> qualified2 : qualifiedArr) {
                Preconditions.checkNotNull(qualified2, "Null interface");
            }
            Collections.addAll(this.providedInterfaces, qualifiedArr);
        }
    }

    public static <T> Builder<T> builder(Class<T> cls) {
        return new Builder<>(cls, new Class[0]);
    }

    public static <T> Component<T> intoSet(final T t11, Class<T> cls) {
        return intoSetBuilder(cls).factory(new ComponentFactory() { // from class: com.google.firebase.components.c
            @Override // com.google.firebase.components.ComponentFactory
            public final Object create(ComponentContainer componentContainer) {
                return Component.m13706d(t11, componentContainer);
            }
        }).build();
    }

    public static <T> Builder<T> intoSetBuilder(Class<T> cls) {
        return builder(cls).intoSet();
    }

    @Deprecated
    /* JADX INFO: renamed from: of */
    public static <T> Component<T> m13708of(Class<T> cls, final T t11) {
        return builder(cls).factory(new ComponentFactory() { // from class: com.google.firebase.components.d
            @Override // com.google.firebase.components.ComponentFactory
            public final Object create(ComponentContainer componentContainer) {
                return Component.m13704b(t11, componentContainer);
            }
        }).build();
    }

    private Component(@Nullable String str, Set<Qualified<? super T>> set, Set<Dependency> set2, int i11, int i12, ComponentFactory<T> componentFactory, Set<Class<?>> set3) {
        this.name = str;
        this.providedInterfaces = Collections.unmodifiableSet(set);
        this.dependencies = Collections.unmodifiableSet(set2);
        this.instantiation = i11;
        this.type = i12;
        this.factory = componentFactory;
        this.publishedEvents = Collections.unmodifiableSet(set3);
    }

    @SafeVarargs
    public static <T> Builder<T> builder(Class<T> cls, Class<? super T>... clsArr) {
        return new Builder<>(cls, clsArr);
    }

    public static <T> Component<T> intoSet(final T t11, Qualified<T> qualified) {
        return intoSetBuilder(qualified).factory(new ComponentFactory() { // from class: com.google.firebase.components.b
            @Override // com.google.firebase.components.ComponentFactory
            public final Object create(ComponentContainer componentContainer) {
                return Component.m13707e(t11, componentContainer);
            }
        }).build();
    }

    public static <T> Builder<T> intoSetBuilder(Qualified<T> qualified) {
        return builder(qualified).intoSet();
    }

    @SafeVarargs
    /* JADX INFO: renamed from: of */
    public static <T> Component<T> m13710of(final T t11, Class<T> cls, Class<? super T>... clsArr) {
        return builder(cls, clsArr).factory(new ComponentFactory() { // from class: com.google.firebase.components.e
            @Override // com.google.firebase.components.ComponentFactory
            public final Object create(ComponentContainer componentContainer) {
                return Component.m13703a(t11, componentContainer);
            }
        }).build();
    }

    public Set<Dependency> getDependencies() {
        return this.dependencies;
    }

    public ComponentFactory<T> getFactory() {
        return this.factory;
    }

    @Nullable
    public String getName() {
        return this.name;
    }

    public Set<Qualified<? super T>> getProvidedInterfaces() {
        return this.providedInterfaces;
    }

    public Set<Class<?>> getPublishedEvents() {
        return this.publishedEvents;
    }

    public boolean isAlwaysEager() {
        return this.instantiation == 1;
    }

    public boolean isEagerInDefaultApp() {
        return this.instantiation == 2;
    }

    public boolean isLazy() {
        return this.instantiation == 0;
    }

    public boolean isValue() {
        return this.type == 0;
    }

    public String toString() {
        return "Component<" + Arrays.toString(this.providedInterfaces.toArray()) + ">{" + this.instantiation + ", type=" + this.type + ", deps=" + Arrays.toString(this.dependencies.toArray()) + "}";
    }

    public Component<T> withFactory(ComponentFactory<T> componentFactory) {
        return new Component<>(this.name, this.providedInterfaces, this.dependencies, this.instantiation, this.type, componentFactory, this.publishedEvents);
    }

    public static <T> Builder<T> builder(Qualified<T> qualified) {
        return new Builder<>(qualified, new Qualified[0]);
    }

    @SafeVarargs
    /* JADX INFO: renamed from: of */
    public static <T> Component<T> m13709of(final T t11, Qualified<T> qualified, Qualified<? super T>... qualifiedArr) {
        return builder(qualified, qualifiedArr).factory(new ComponentFactory() { // from class: com.google.firebase.components.a
            @Override // com.google.firebase.components.ComponentFactory
            public final Object create(ComponentContainer componentContainer) {
                return Component.m13705c(t11, componentContainer);
            }
        }).build();
    }

    @SafeVarargs
    public static <T> Builder<T> builder(Qualified<T> qualified, Qualified<? super T>... qualifiedArr) {
        return new Builder<>(qualified, qualifiedArr);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Object m13703a(Object obj, ComponentContainer componentContainer) {
        return obj;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ Object m13704b(Object obj, ComponentContainer componentContainer) {
        return obj;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ Object m13705c(Object obj, ComponentContainer componentContainer) {
        return obj;
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ Object m13706d(Object obj, ComponentContainer componentContainer) {
        return obj;
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ Object m13707e(Object obj, ComponentContainer componentContainer) {
        return obj;
    }
}
