package shark;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.ArraysKt;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.text.Regex;
import shark.internal.KeyedWeakReferenceMirror;

/* JADX INFO: compiled from: ObjectInspectors.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90082bv = {1, 0, 3}, m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\u0001\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0001\u0012B\u0007\b\u0002¢\u0006\u0002\u0010\u0003R1\u0010\u0004\u001a\u001f\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n\u0018\u00010\u0005X\u0090\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0013"}, m90084d2 = {"Lshark/ObjectInspectors;", "", "Lshark/ObjectInspector;", "(Ljava/lang/String;I)V", "leakingObjectFilter", "Lkotlin/Function1;", "Lshark/HeapObject;", "Lkotlin/ParameterName;", "name", "heapObject", "", "getLeakingObjectFilter$shark", "()Lkotlin/jvm/functions/Function1;", "KEYED_WEAK_REFERENCE", "CLASSLOADER", "CLASS", "ANONYMOUS_CLASS", "THREAD", "Companion", "shark"}, m90085k = 1, m90086mv = {1, 4, 1})
public enum ObjectInspectors implements ObjectInspector {
    KEYED_WEAK_REFERENCE { // from class: shark.ObjectInspectors.KEYED_WEAK_REFERENCE

        @NotNull
        private final Function1<HeapObject, Boolean> leakingObjectFilter = new Function1<HeapObject, Boolean>() { // from class: shark.ObjectInspectors$KEYED_WEAK_REFERENCE$leakingObjectFilter$1
            @Override // p852kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Boolean invoke(HeapObject heapObject) {
                return Boolean.valueOf(invoke2(heapObject));
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final boolean invoke2(@NotNull HeapObject heapObject) {
                List<KeyedWeakReferenceMirror> listM98147b = KeyedWeakReferenceFinder.f98205a.m98147b(heapObject.mo98005e());
                ArrayList arrayList = new ArrayList();
                for (Object obj : listM98147b) {
                    KeyedWeakReferenceMirror keyedWeakReferenceMirror = (KeyedWeakReferenceMirror) obj;
                    if (keyedWeakReferenceMirror.getHasReferent() && keyedWeakReferenceMirror.getIsRetained()) {
                        arrayList.add(obj);
                    }
                }
                if (arrayList.isEmpty()) {
                    return false;
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if (((KeyedWeakReferenceMirror) it.next()).getReferent().getValue() == heapObject.getObjectId()) {
                        return true;
                    }
                }
                return false;
            }
        };

        @Override // shark.ObjectInspectors
        @NotNull
        public Function1<HeapObject, Boolean> getLeakingObjectFilter$shark() {
            return this.leakingObjectFilter;
        }

        @Override // shark.ObjectInspectors, shark.ObjectInspector
        public void inspect(@NotNull C44495q reporter) {
            String str;
            List<KeyedWeakReferenceMirror> listM98147b = KeyedWeakReferenceFinder.f98205a.m98147b(reporter.getHeapObject().mo98005e());
            long objectId = reporter.getHeapObject().getObjectId();
            for (KeyedWeakReferenceMirror keyedWeakReferenceMirror : listM98147b) {
                if (keyedWeakReferenceMirror.getReferent().getValue() == objectId) {
                    Set<String> setM98459c = reporter.m98459c();
                    if (keyedWeakReferenceMirror.getCom.tencent.qcloud.tuicore.TUIConstants.TUIPlugin.PLUGIN_DESCRIPTION java.lang.String().length() > 0) {
                        str = "ObjectWatcher was watching this because " + keyedWeakReferenceMirror.getCom.tencent.qcloud.tuicore.TUIConstants.TUIPlugin.PLUGIN_DESCRIPTION java.lang.String();
                    } else {
                        str = "ObjectWatcher was watching this";
                    }
                    setM98459c.add(str);
                    reporter.m98458b().add("key = " + keyedWeakReferenceMirror.getKey());
                    if (keyedWeakReferenceMirror.getWatchDurationMillis() != null) {
                        reporter.m98458b().add("watchDurationMillis = " + keyedWeakReferenceMirror.getWatchDurationMillis());
                    }
                    if (keyedWeakReferenceMirror.getRetainedDurationMillis() != null) {
                        reporter.m98458b().add("retainedDurationMillis = " + keyedWeakReferenceMirror.getRetainedDurationMillis());
                    }
                }
            }
        }
    },
    CLASSLOADER { // from class: shark.ObjectInspectors.CLASSLOADER
        @Override // shark.ObjectInspectors, shark.ObjectInspector
        public void inspect(@NotNull C44495q reporter) {
            reporter.m98462f(Reflection.getOrCreateKotlinClass(ClassLoader.class), new Function2<C44495q, HeapObject.HeapInstance, Unit>() { // from class: shark.ObjectInspectors$CLASSLOADER$inspect$1
                @Override // p852kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(C44495q c44495q, HeapObject.HeapInstance heapInstance) {
                    invoke2(c44495q, heapInstance);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull C44495q c44495q, @NotNull HeapObject.HeapInstance heapInstance) {
                    c44495q.m98460d().add("A ClassLoader is never leaking");
                }
            });
        }
    },
    CLASS { // from class: shark.ObjectInspectors.CLASS
        @Override // shark.ObjectInspectors, shark.ObjectInspector
        public void inspect(@NotNull C44495q reporter) {
            if (reporter.getHeapObject() instanceof HeapObject.HeapClass) {
                reporter.m98460d().add("a class is never leaking");
            }
        }
    },
    ANONYMOUS_CLASS { // from class: shark.ObjectInspectors.ANONYMOUS_CLASS
        @Override // shark.ObjectInspectors, shark.ObjectInspector
        public void inspect(@NotNull C44495q reporter) {
            boolean z11;
            String string;
            HeapObject heapObject = reporter.getHeapObject();
            if (heapObject instanceof HeapObject.HeapInstance) {
                HeapObject.HeapClass heapClassM98032n = ((HeapObject.HeapInstance) heapObject).m98032n();
                if (ObjectInspectors.f98220c.matches(heapClassM98032n.m98017p())) {
                    HeapObject.HeapClass heapClassM98018q = heapClassM98032n.m98018q();
                    if (heapClassM98018q == null) {
                        Intrinsics.throwNpe();
                    }
                    if (Intrinsics.areEqual(heapClassM98018q.m98017p(), "java.lang.Object")) {
                        try {
                            Class<?> actualClass = Class.forName(heapClassM98032n.m98017p());
                            Intrinsics.checkExpressionValueIsNotNull(actualClass, "actualClass");
                            Class<?>[] interfaces = actualClass.getInterfaces();
                            LinkedHashSet<String> linkedHashSetM98458b = reporter.m98458b();
                            Intrinsics.checkExpressionValueIsNotNull(interfaces, "interfaces");
                            if (interfaces.length == 0) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            if (!z11) {
                                Class<?> implementedInterface = interfaces[0];
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append("Anonymous class implementing ");
                                Intrinsics.checkExpressionValueIsNotNull(implementedInterface, "implementedInterface");
                                sb2.append(implementedInterface.getName());
                                string = sb2.toString();
                            } else {
                                string = "Anonymous subclass of java.lang.Object";
                            }
                            linkedHashSetM98458b.add(string);
                            return;
                        } catch (ClassNotFoundException unused) {
                            return;
                        }
                    }
                    reporter.m98458b().add("Anonymous subclass of " + heapClassM98018q.m98017p());
                }
            }
        }
    },
    THREAD { // from class: shark.ObjectInspectors.THREAD
        @Override // shark.ObjectInspectors, shark.ObjectInspector
        public void inspect(@NotNull C44495q reporter) {
            reporter.m98462f(Reflection.getOrCreateKotlinClass(Thread.class), new Function2<C44495q, HeapObject.HeapInstance, Unit>() { // from class: shark.ObjectInspectors$THREAD$inspect$1
                @Override // p852kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(C44495q c44495q, HeapObject.HeapInstance heapInstance) {
                    invoke2(c44495q, heapInstance);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull C44495q c44495q, @NotNull HeapObject.HeapInstance heapInstance) {
                    C44455h c44455hM98029k = heapInstance.m98029k(Reflection.getOrCreateKotlinClass(Thread.class), "name");
                    if (c44455hM98029k == null) {
                        Intrinsics.throwNpe();
                    }
                    String strM98439g = c44455hM98029k.getValue().m98439g();
                    c44495q.m98458b().add("Thread name: '" + strM98439g + '\'');
                }
            });
        }
    };


    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;

    /* JADX INFO: renamed from: c */
    public static final Regex f98220c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final List<FilteringLeakingObjectFinder.InterfaceC44419a> f98221d;

    @Nullable
    private final Function1<HeapObject, Boolean> leakingObjectFilter;

    /* JADX INFO: compiled from: ObjectInspectors.kt */
    @Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00078F¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\rR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m90084d2 = {"Lshark/ObjectInspectors$Companion;", "", "<init>", "()V", "", "Lshark/ObjectInspectors;", "inspectors", "", "Lshark/FilteringLeakingObjectFinder$a;", "createLeakingObjectFilters", "(Ljava/util/Set;)Ljava/util/List;", "Lshark/ObjectInspector;", "getJdkDefaults", "()Ljava/util/List;", "jdkDefaults", "jdkLeakingObjectFilters", "Ljava/util/List;", "getJdkLeakingObjectFilters", "", "ANONYMOUS_CLASS_NAME_PATTERN", "Ljava/lang/String;", "Lkotlin/text/Regex;", "ANONYMOUS_CLASS_NAME_PATTERN_REGEX", "Lkotlin/text/Regex;", "shark"}, m90085k = 1, m90086mv = {1, 4, 1})
    public static final class Companion {

        /* JADX INFO: renamed from: shark.ObjectInspectors$Companion$a */
        /* JADX INFO: compiled from: ObjectInspectors.kt */
        @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m90084d2 = {"shark/ObjectInspectors$Companion$a", "Lshark/FilteringLeakingObjectFinder$a;", "Lshark/HeapObject;", "heapObject", "", "isLeakingObject", "(Lshark/HeapObject;)Z", "shark"}, m90085k = 1, m90086mv = {1, 4, 1})
        public static final class C44434a implements FilteringLeakingObjectFinder.InterfaceC44419a {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ Function1 f98222a;

            public C44434a(Function1 function1) {
                this.f98222a = function1;
            }

            @Override // shark.FilteringLeakingObjectFinder.InterfaceC44419a
            public boolean isLeakingObject(@NotNull HeapObject heapObject) {
                return ((Boolean) this.f98222a.invoke(heapObject)).booleanValue();
            }
        }

        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final List<FilteringLeakingObjectFinder.InterfaceC44419a> createLeakingObjectFilters(@NotNull Set<? extends ObjectInspectors> inspectors) {
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = inspectors.iterator();
            while (it.hasNext()) {
                Function1<HeapObject, Boolean> leakingObjectFilter$shark = ((ObjectInspectors) it.next()).getLeakingObjectFilter$shark();
                if (leakingObjectFilter$shark != null) {
                    arrayList.add(leakingObjectFilter$shark);
                }
            }
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayList2.add(new C44434a((Function1) it2.next()));
            }
            return arrayList2;
        }

        @NotNull
        public final List<ObjectInspector> getJdkDefaults() {
            return ArraysKt.toList(ObjectInspectors.values());
        }

        @NotNull
        public final List<FilteringLeakingObjectFinder.InterfaceC44419a> getJdkLeakingObjectFilters() {
            return ObjectInspectors.f98221d;
        }
    }

    @Override // shark.ObjectInspector
    public abstract /* synthetic */ void inspect(@NotNull C44495q c44495q);

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        f98220c = new Regex("^.+\\$\\d+$");
        EnumSet enumSetAllOf = EnumSet.allOf(ObjectInspectors.class);
        Intrinsics.checkExpressionValueIsNotNull(enumSetAllOf, "EnumSet.allOf(ObjectInspectors::class.java)");
        f98221d = companion.createLeakingObjectFilters(enumSetAllOf);
    }

    /* synthetic */ ObjectInspectors(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Nullable
    public Function1<HeapObject, Boolean> getLeakingObjectFilter$shark() {
        return this.leakingObjectFilter;
    }
}
