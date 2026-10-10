package com.google.common.util.concurrent;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import com.google.common.collect.Ordering;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes56.dex */
@J2ktIncompatible
@ElementTypesAreNonnullByDefault
@GwtIncompatible
final class FuturesGetChecked {
    private static final Ordering<List<Class<?>>> ORDERING_BY_CONSTRUCTOR_PARAMETER_LIST;
    private static final Ordering<Constructor<?>> WITH_STRING_PARAM_THEN_WITH_THROWABLE_PARAM;

    @VisibleForTesting
    public interface GetCheckedTypeValidator {
        void validateClass(Class<? extends Exception> cls);
    }

    @CanIgnoreReturnValue
    @ParametricNullness
    public static <V, X extends Exception> V getChecked(Future<V> future, Class<X> cls) throws Exception {
        return (V) getChecked(bestGetCheckedTypeValidator(), future, cls);
    }

    @VisibleForTesting
    public static class GetCheckedTypeValidatorHolder {
        static final GetCheckedTypeValidator BEST_VALIDATOR = getBestValidator();

        public enum WeakSetValidator implements GetCheckedTypeValidator {
            INSTANCE;

            private static final Set<WeakReference<Class<? extends Exception>>> validClasses = new CopyOnWriteArraySet();

            @Override // com.google.common.util.concurrent.FuturesGetChecked.GetCheckedTypeValidator
            public void validateClass(Class<? extends Exception> cls) {
                Iterator<WeakReference<Class<? extends Exception>>> it = validClasses.iterator();
                while (it.hasNext()) {
                    if (cls.equals(it.next().get())) {
                        return;
                    }
                }
                FuturesGetChecked.checkExceptionClassValidity(cls);
                Set<WeakReference<Class<? extends Exception>>> set = validClasses;
                if (set.size() > 1000) {
                    set.clear();
                }
                set.add(new WeakReference<>(cls));
            }
        }

        public static GetCheckedTypeValidator getBestValidator() {
            return FuturesGetChecked.weakSetValidator();
        }
    }

    private static GetCheckedTypeValidator bestGetCheckedTypeValidator() {
        return GetCheckedTypeValidatorHolder.BEST_VALIDATOR;
    }

    @VisibleForTesting
    @CanIgnoreReturnValue
    @ParametricNullness
    public static <V, X extends Exception> V getChecked(GetCheckedTypeValidator getCheckedTypeValidator, Future<V> future, Class<X> cls) throws Exception {
        getCheckedTypeValidator.validateClass(cls);
        try {
            return future.get();
        } catch (InterruptedException e11) {
            Thread.currentThread().interrupt();
            throw newWithCause(cls, e11);
        } catch (ExecutionException e12) {
            wrapAndThrowExceptionOrError(e12.getCause(), cls);
            throw new AssertionError();
        }
    }

    private static boolean hasConstructorUsableByGetChecked(Class<? extends Exception> cls) {
        try {
            newWithCause(cls, new Exception());
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    @VisibleForTesting
    public static boolean isCheckedException(Class<? extends Exception> cls) {
        return !RuntimeException.class.isAssignableFrom(cls);
    }

    private static <X extends Exception> List<Constructor<X>> preferringStringsThenThrowables(List<Constructor<X>> list) {
        return (List<Constructor<X>>) WITH_STRING_PARAM_THEN_WITH_THROWABLE_PARAM.sortedCopy(list);
    }

    @VisibleForTesting
    public static GetCheckedTypeValidator weakSetValidator() {
        return GetCheckedTypeValidatorHolder.WeakSetValidator.INSTANCE;
    }

    private static <X extends Exception> void wrapAndThrowExceptionOrError(Throwable th2, Class<X> cls) throws Exception {
        if (th2 instanceof Error) {
            throw new ExecutionError((Error) th2);
        }
        if (!(th2 instanceof RuntimeException)) {
            throw newWithCause(cls, th2);
        }
        throw new UncheckedExecutionException(th2);
    }

    static {
        Ordering<List<Class<?>>> orderingReverse = Ordering.natural().onResultOf(new Function() { // from class: com.google.common.util.concurrent.u
            @Override // com.google.common.base.Function
            public final Object apply(Object obj) {
                return Boolean.valueOf(((List) obj).contains(String.class));
            }
        }).compound(Ordering.natural().onResultOf(new Function() { // from class: com.google.common.util.concurrent.v
            @Override // com.google.common.base.Function
            public final Object apply(Object obj) {
                return Boolean.valueOf(((List) obj).contains(Throwable.class));
            }
        })).reverse();
        ORDERING_BY_CONSTRUCTOR_PARAMETER_LIST = orderingReverse;
        WITH_STRING_PARAM_THEN_WITH_THROWABLE_PARAM = orderingReverse.onResultOf(new Function() { // from class: com.google.common.util.concurrent.w
            @Override // com.google.common.base.Function
            public final Object apply(Object obj) {
                return Arrays.asList(((Constructor) obj).getParameterTypes());
            }
        });
    }

    private FuturesGetChecked() {
    }

    @VisibleForTesting
    public static void checkExceptionClassValidity(Class<? extends Exception> cls) {
        Preconditions.checkArgument(isCheckedException(cls), "Futures.getChecked exception type (%s) must not be a RuntimeException", cls);
        Preconditions.checkArgument(hasConstructorUsableByGetChecked(cls), "Futures.getChecked exception type (%s) must be an accessible class with an accessible constructor whose parameters (if any) must be of type String and/or Throwable", cls);
    }

    private static <X> X newFromConstructor(Constructor<X> constructor, Throwable th2) {
        Class<?>[] parameterTypes = constructor.getParameterTypes();
        Object[] objArr = new Object[parameterTypes.length];
        for (int i11 = 0; i11 < parameterTypes.length; i11++) {
            Class<?> cls = parameterTypes[i11];
            if (cls.equals(String.class)) {
                objArr[i11] = th2.toString();
            } else {
                if (!cls.equals(Throwable.class)) {
                    return null;
                }
                objArr[i11] = th2;
            }
        }
        try {
            return constructor.newInstance(objArr);
        } catch (IllegalAccessException | IllegalArgumentException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    private static <X extends Exception> X newWithCause(Class<X> cls, Throwable th2) {
        Iterator it = preferringStringsThenThrowables(Arrays.asList(cls.getConstructors())).iterator();
        while (it.hasNext()) {
            X x11 = (X) newFromConstructor((Constructor) it.next(), th2);
            if (x11 != null) {
                if (x11.getCause() == null) {
                    x11.initCause(th2);
                }
                return x11;
            }
        }
        throw new IllegalArgumentException("No appropriate constructor for exception of type " + cls + " in response to chained exception", th2);
    }

    @CanIgnoreReturnValue
    @ParametricNullness
    public static <V, X extends Exception> V getChecked(Future<V> future, Class<X> cls, long j11, TimeUnit timeUnit) throws Exception {
        bestGetCheckedTypeValidator().validateClass(cls);
        try {
            return future.get(j11, timeUnit);
        } catch (InterruptedException e11) {
            Thread.currentThread().interrupt();
            throw newWithCause(cls, e11);
        } catch (ExecutionException e12) {
            wrapAndThrowExceptionOrError(e12.getCause(), cls);
            throw new AssertionError();
        } catch (TimeoutException e13) {
            throw newWithCause(cls, e13);
        }
    }
}
