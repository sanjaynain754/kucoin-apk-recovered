package shark;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import com.tencent.bugly.proguard.C33627eb;
import com.tencent.bugly.proguard.InterfaceC33953u5;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.sequences.Sequence;
import p852kotlin.sequences.SequencesKt;
import p852kotlin.text.StringsKt;
import shark.internal.C44486l;

/* JADX INFO: compiled from: LeakTrace.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u0000\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\b\u0018\u0000 62\u00020\u0001:\u000267B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J4\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\r2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020\rH\u0002¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0015R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010'\u001a\u0004\b(\u0010\u0017R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010)\u001a\u0004\b*\u0010\u0019R\u0013\u0010-\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0013\u0010/\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b.\u0010,R\u0017\u00103\u001a\b\u0012\u0004\u0012\u00020\u0005008F¢\u0006\u0006\u001a\u0004\b1\u00102R\u0011\u00105\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b4\u0010\u0012¨\u00068"}, m90084d2 = {"Lshark/LeakTrace;", "Ljava/io/Serializable;", "Lshark/LeakTrace$GcRootType;", "gcRootType", "", "Lshark/LeakTraceReference;", "referencePath", "Lshark/LeakTraceObject;", "leakingObject", "<init>", "(Lshark/LeakTrace$GcRootType;Ljava/util/List;Lshark/LeakTraceObject;)V", "", "index", "", "referencePathElementIsSuspect", "(I)Z", "", "toString", "()Ljava/lang/String;", "toSimplePathString", "component1", "()Lshark/LeakTrace$GcRootType;", "component2", "()Ljava/util/List;", "component3", "()Lshark/LeakTraceObject;", "copy", "(Lshark/LeakTrace$GcRootType;Ljava/util/List;Lshark/LeakTraceObject;)Lshark/LeakTrace;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "showLeakingStatus", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Z)Ljava/lang/String;", "Lshark/LeakTrace$GcRootType;", "getGcRootType", "Ljava/util/List;", "getReferencePath", "Lshark/LeakTraceObject;", "getLeakingObject", "getRetainedHeapByteSize", "()Ljava/lang/Integer;", "retainedHeapByteSize", "getRetainedObjectCount", "retainedObjectCount", "Lkotlin/sequences/Sequence;", "getSuspectReferenceSubpath", "()Lkotlin/sequences/Sequence;", "suspectReferenceSubpath", "getSignature", TUIConstants.TUICalling.PARAM_NAME_AUDIO_SIGNATURE, "Companion", "GcRootType", "shark"}, m90085k = 1, m90086mv = {1, 4, 1})
public final /* data */ class LeakTrace implements Serializable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final char ZERO_WIDTH_SPACE = 8203;
    private static final long serialVersionUID = -6315725584154386429L;

    @NotNull
    private final GcRootType gcRootType;

    @NotNull
    private final LeakTraceObject leakingObject;

    @NotNull
    private final List<LeakTraceReference> referencePath;

    /* JADX INFO: compiled from: LeakTrace.kt */
    @Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m90084d2 = {"Lshark/LeakTrace$Companion;", "", "<init>", "()V", "Lshark/LeakTrace;", "leakTrace", "Lshark/LeakTraceReference;", TypedValues.Custom.S_REFERENCE, "", "index", "", "showLeakingStatus", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lshark/LeakTrace;Lshark/LeakTraceReference;IZ)Ljava/lang/String;", "", "ZERO_WIDTH_SPACE", "C", "", "serialVersionUID", "J", "shark"}, m90085k = 1, m90086mv = {1, 4, 1})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final String m98150a(LeakTrace leakTrace, LeakTraceReference reference, int index, boolean showLeakingStatus) {
            String str;
            if (reference.getReferenceType() == LeakTraceReference.ReferenceType.STATIC_FIELD) {
                str = " static";
            } else {
                str = "";
            }
            String str2 = "    ↓" + str + ' ' + reference.getOwningClassSimpleName() + '.' + reference.getReferenceDisplayName();
            if (showLeakingStatus && leakTrace.referencePathElementIsSuspect(index)) {
                int iLastIndexOf$default = StringsKt.lastIndexOf$default((CharSequence) str2, '.', 0, false, 6, (Object) null) + 1;
                int length = str2.length() - iLastIndexOf$default;
                return "\n│" + str2 + "\n│" + StringsKt.repeat(C33627eb.f69716f, iLastIndexOf$default) + StringsKt.repeat("~", length);
            }
            return "\n│" + str2;
        }
    }

    /* JADX INFO: compiled from: LeakTrace.kt */
    @Metadata(m90082bv = {1, 0, 3}, m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\u0001\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0010B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0011"}, m90084d2 = {"Lshark/LeakTrace$GcRootType;", "", TUIConstants.TUIPlugin.PLUGIN_DESCRIPTION, "", "(Ljava/lang/String;ILjava/lang/String;)V", "getDescription", "()Ljava/lang/String;", "JNI_GLOBAL", "JNI_LOCAL", "JAVA_FRAME", "NATIVE_STACK", "STICKY_CLASS", "THREAD_BLOCK", "MONITOR_USED", "THREAD_OBJECT", "JNI_MONITOR", "Companion", "shark"}, m90085k = 1, m90086mv = {1, 4, 1})
    public enum GcRootType {
        JNI_GLOBAL("Global variable in native code"),
        JNI_LOCAL("Local variable in native code"),
        JAVA_FRAME("Java local variable"),
        NATIVE_STACK("Input or output parameters in native code"),
        STICKY_CLASS("System class"),
        THREAD_BLOCK("Thread block"),
        MONITOR_USED("Monitor (anything that called the wait() or notify() methods, or that is synchronized.)"),
        THREAD_OBJECT("Thread object"),
        JNI_MONITOR("Root JNI monitor");


        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        private final String description;

        /* JADX INFO: compiled from: LeakTrace.kt */
        @Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m90084d2 = {"Lshark/LeakTrace$GcRootType$Companion;", "", "<init>", "()V", "Lshark/d;", "gcRoot", "Lshark/LeakTrace$GcRootType;", "fromGcRoot", "(Lshark/d;)Lshark/LeakTrace$GcRootType;", "shark"}, m90085k = 1, m90086mv = {1, 4, 1})
        public static final class Companion {
            public Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final GcRootType fromGcRoot(@NotNull AbstractC44451d gcRoot) {
                if (gcRoot instanceof AbstractC44451d.e) {
                    return GcRootType.JNI_GLOBAL;
                }
                if (gcRoot instanceof AbstractC44451d.f) {
                    return GcRootType.JNI_LOCAL;
                }
                if (gcRoot instanceof AbstractC44451d.d) {
                    return GcRootType.JAVA_FRAME;
                }
                if (gcRoot instanceof AbstractC44451d.i) {
                    return GcRootType.NATIVE_STACK;
                }
                if (gcRoot instanceof AbstractC44451d.k) {
                    return GcRootType.STICKY_CLASS;
                }
                if (gcRoot instanceof AbstractC44451d.l) {
                    return GcRootType.THREAD_BLOCK;
                }
                if (gcRoot instanceof AbstractC44451d.h) {
                    return GcRootType.MONITOR_USED;
                }
                if (gcRoot instanceof AbstractC44451d.m) {
                    return GcRootType.THREAD_OBJECT;
                }
                if (gcRoot instanceof AbstractC44451d.g) {
                    return GcRootType.JNI_MONITOR;
                }
                throw new IllegalStateException("Unexpected gc root " + gcRoot);
            }
        }

        @NotNull
        public final String getDescription() {
            return this.description;
        }

        GcRootType(String str) {
            this.description = str;
        }
    }

    @NotNull
    public final String toSimplePathString() {
        return m98149a(false);
    }

    @NotNull
    public String toString() {
        return m98149a(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LeakTrace copy$default(LeakTrace leakTrace, GcRootType gcRootType, List list, LeakTraceObject leakTraceObject, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            gcRootType = leakTrace.gcRootType;
        }
        if ((i11 & 2) != 0) {
            list = leakTrace.referencePath;
        }
        if ((i11 & 4) != 0) {
            leakTraceObject = leakTrace.leakingObject;
        }
        return leakTrace.copy(gcRootType, list, leakTraceObject);
    }

    /* JADX INFO: renamed from: a */
    public final String m98149a(boolean showLeakingStatus) {
        String strTrimIndent = StringsKt.trimIndent("\n        ┬───\n        │ GC Root: " + this.gcRootType.getDescription() + "\n        │\n      ");
        int i11 = 0;
        for (Object obj : this.referencePath) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            LeakTraceReference leakTraceReference = (LeakTraceReference) obj;
            LeakTraceObject originObject = leakTraceReference.getOriginObject();
            String str = strTrimIndent + ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append(originObject.toString$shark("├─ ", "│    ", showLeakingStatus, (i11 == 0 && this.gcRootType == GcRootType.JAVA_FRAME) ? InterfaceC33953u5.f72225u : originObject.getTypeName()));
            strTrimIndent = sb2.toString() + INSTANCE.m98150a(this, leakTraceReference, i11, showLeakingStatus);
            i11 = i12;
        }
        return (strTrimIndent + ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE) + LeakTraceObject.toString$shark$default(this.leakingObject, "╰→ ", "\u200b     ", showLeakingStatus, null, 8, null);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final GcRootType getGcRootType() {
        return this.gcRootType;
    }

    @NotNull
    public final List<LeakTraceReference> component2() {
        return this.referencePath;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final LeakTraceObject getLeakingObject() {
        return this.leakingObject;
    }

    @NotNull
    public final LeakTrace copy(@NotNull GcRootType gcRootType, @NotNull List<LeakTraceReference> referencePath, @NotNull LeakTraceObject leakingObject) {
        return new LeakTrace(gcRootType, referencePath, leakingObject);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LeakTrace)) {
            return false;
        }
        LeakTrace leakTrace = (LeakTrace) other;
        return Intrinsics.areEqual(this.gcRootType, leakTrace.gcRootType) && Intrinsics.areEqual(this.referencePath, leakTrace.referencePath) && Intrinsics.areEqual(this.leakingObject, leakTrace.leakingObject);
    }

    @NotNull
    public final GcRootType getGcRootType() {
        return this.gcRootType;
    }

    @NotNull
    public final LeakTraceObject getLeakingObject() {
        return this.leakingObject;
    }

    @NotNull
    public final List<LeakTraceReference> getReferencePath() {
        return this.referencePath;
    }

    @Nullable
    public final Integer getRetainedHeapByteSize() {
        List listListOf = CollectionsKt.listOf(this.leakingObject);
        List<LeakTraceReference> list = this.referencePath;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((LeakTraceReference) it.next()).getOriginObject());
        }
        List listPlus = CollectionsKt.plus((Collection) listListOf, (Iterable) arrayList);
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : listPlus) {
            if (((LeakTraceObject) obj).getLeakingStatus() == LeakTraceObject.LeakingStatus.LEAKING) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            Integer retainedHeapByteSize = ((LeakTraceObject) it2.next()).getRetainedHeapByteSize();
            if (retainedHeapByteSize != null) {
                arrayList3.add(retainedHeapByteSize);
            }
        }
        return (Integer) CollectionsKt.max((Iterable) arrayList3);
    }

    @Nullable
    public final Integer getRetainedObjectCount() {
        List listListOf = CollectionsKt.listOf(this.leakingObject);
        List<LeakTraceReference> list = this.referencePath;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((LeakTraceReference) it.next()).getOriginObject());
        }
        List listPlus = CollectionsKt.plus((Collection) listListOf, (Iterable) arrayList);
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : listPlus) {
            if (((LeakTraceObject) obj).getLeakingStatus() == LeakTraceObject.LeakingStatus.LEAKING) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            Integer retainedObjectCount = ((LeakTraceObject) it2.next()).getRetainedObjectCount();
            if (retainedObjectCount != null) {
                arrayList3.add(retainedObjectCount);
            }
        }
        return (Integer) CollectionsKt.max((Iterable) arrayList3);
    }

    @NotNull
    public final Sequence<LeakTraceReference> getSuspectReferenceSubpath() {
        return SequencesKt.filterIndexed(CollectionsKt.asSequence(this.referencePath), new Function2<Integer, LeakTraceReference, Boolean>() { // from class: shark.LeakTrace$suspectReferenceSubpath$1
            @Override // p852kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Boolean invoke(Integer num, LeakTraceReference leakTraceReference) {
                return Boolean.valueOf(invoke(num.intValue(), leakTraceReference));
            }

            {
                super(2);
            }

            public final boolean invoke(int i11, @NotNull LeakTraceReference leakTraceReference) {
                return this.this$0.referencePathElementIsSuspect(i11);
            }
        });
    }

    public int hashCode() {
        GcRootType gcRootType = this.gcRootType;
        int iHashCode = (gcRootType != null ? gcRootType.hashCode() : 0) * 31;
        List<LeakTraceReference> list = this.referencePath;
        int iHashCode2 = (iHashCode + (list != null ? list.hashCode() : 0)) * 31;
        LeakTraceObject leakTraceObject = this.leakingObject;
        return iHashCode2 + (leakTraceObject != null ? leakTraceObject.hashCode() : 0);
    }

    public final boolean referencePathElementIsSuspect(int index) {
        int i11 = C44491m.$EnumSwitchMapping$0[this.referencePath.get(index).getOriginObject().getLeakingStatus().ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                return false;
            }
            if (index != CollectionsKt.getLastIndex(this.referencePath) && this.referencePath.get(index + 1).getOriginObject().getLeakingStatus() == LeakTraceObject.LeakingStatus.NOT_LEAKING) {
                return false;
            }
        }
        return true;
    }

    public LeakTrace(@NotNull GcRootType gcRootType, @NotNull List<LeakTraceReference> list, @NotNull LeakTraceObject leakTraceObject) {
        this.gcRootType = gcRootType;
        this.referencePath = list;
        this.leakingObject = leakTraceObject;
    }

    @NotNull
    public final String getSignature() {
        return C44486l.m98412b(SequencesKt.joinToString$default(getSuspectReferenceSubpath(), "", null, null, 0, null, new Function1<LeakTraceReference, CharSequence>() { // from class: shark.LeakTrace$signature$1
            @Override // p852kotlin.jvm.functions.Function1
            @NotNull
            public final CharSequence invoke(@NotNull LeakTraceReference leakTraceReference) {
                return leakTraceReference.getOriginObject().getClassName() + leakTraceReference.getReferenceGenericName();
            }
        }, 30, null));
    }
}
