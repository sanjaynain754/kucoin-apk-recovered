package p569qq;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.kubi.monitor.FinishType;
import com.tencent.bugly.proguard.C33590cg;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p642tq.InterfaceC45062e;
import p642tq.InterfaceC45063f;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.Intrinsics;
import ro.C44128b;

/* JADX INFO: renamed from: qq.o */
/* JADX INFO: compiled from: Transitions.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u001b\u0012B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JC\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\fJ-\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0012\u0010\u0003R\u0014\u0010\u0015\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0014R \u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0019¨\u0006\u001c"}, m90084d2 = {"Lqq/o;", "", "<init>", "()V", "", "name", "operation", "sign", TUIConstants.TUIPlugin.PLUGIN_DESCRIPTION, "category", "Ltq/e;", "d", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ltq/e;", "Lcom/kubi/monitor/FinishType;", "finishType", "", "c", "(Ljava/lang/String;Ljava/lang/String;Lcom/kubi/monitor/FinishType;)V", "b", "Ltq/f;", "Ltq/f;", "performance", "", "Lqq/o$b;", "Lqq/o$a;", "Ljava/util/Map;", C33590cg.f69440j, CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Monitor_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
public final class C43854o {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C43854o f96924a = new C43854o();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final InterfaceC45063f performance = C43848i.f96913a.m96586e().mo32843e();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public static final Map<b, a> cache = new ConcurrentHashMap();

    /* JADX INFO: renamed from: qq.o$a */
    /* JADX INFO: compiled from: Transitions.kt */
    @Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0014\u001a\u0004\b\u0015\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u001d\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\"\u001a\u00020\u001e8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u0016\u0010!¨\u0006#"}, m90084d2 = {"Lqq/o$a;", "Ltq/e;", "", "operation", "sign", TtmlNode.TAG_SPAN, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ltq/e;)V", "", "newTime", "", "c", "(J)Z", "Lcom/kubi/monitor/FinishType;", "type", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lcom/kubi/monitor/FinishType;)V", "toString", "()Ljava/lang/String;", "Ljava/lang/String;", "getSign", "b", "Ltq/e;", "getSpan", "()Ltq/e;", "J", "getTime", "()J", "time", "Lqq/o$b;", "d", "Lqq/o$b;", "()Lqq/o$b;", "key", "Monitor_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
    public static final class a implements InterfaceC45062e {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @Nullable
        public final String sign;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final InterfaceC45062e span;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        public final long time;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @NotNull
        public final b key;

        public a(@NotNull String operation, @Nullable String str, @NotNull InterfaceC45062e span) {
            Intrinsics.checkNotNullParameter(operation, "operation");
            Intrinsics.checkNotNullParameter(span, "span");
            this.sign = str;
            this.span = span;
            this.time = System.currentTimeMillis();
            this.key = new b(operation, str);
        }

        @Override // p642tq.InterfaceC45062e
        /* JADX INFO: renamed from: a */
        public void mo32881a(@NotNull FinishType type) {
            Intrinsics.checkNotNullParameter(type, "type");
            this.span.mo32881a(type);
            C43854o.cache.remove(this.key);
            C43840a.m96550d("item finish " + this.key + " cost=" + (System.currentTimeMillis() - this.time) + "ms", TypedValues.TransitionType.NAME);
            C44128b.m97259c(TypedValues.TransitionType.NAME, "item finish " + this.key + " [" + C43854o.cache.size() + ']');
        }

        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public final b getKey() {
            return this.key;
        }

        /* JADX INFO: renamed from: c */
        public final boolean m96614c(long newTime) {
            return newTime - this.time > 300000;
        }

        @NotNull
        public String toString() {
            return this.key.toString();
        }
    }

    /* JADX INFO: renamed from: qq.o$b */
    /* JADX INFO: compiled from: Transitions.kt */
    @Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0082\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0011\u001a\u0004\b\u0013\u0010\b¨\u0006\u0014"}, m90084d2 = {"Lqq/o$b;", "", "", "operation", "sign", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Ljava/lang/String;", "b", "getSign", "Monitor_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
    public static final /* data */ class b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final String operation;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @Nullable
        public final String sign;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            return Intrinsics.areEqual(this.operation, bVar.operation) && Intrinsics.areEqual(this.sign, bVar.sign);
        }

        public b(@NotNull String operation, @Nullable String str) {
            Intrinsics.checkNotNullParameter(operation, "operation");
            this.operation = operation;
            this.sign = str;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getOperation() {
            return this.operation;
        }

        public int hashCode() {
            int iHashCode = this.operation.hashCode() * 31;
            String str = this.sign;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @NotNull
        public String toString() {
            if (this.sign == null) {
                return this.operation;
            }
            return this.operation + '[' + ((Object) this.sign) + ']';
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: c */
    public static final void m96610c(@NotNull String operation, @Nullable String sign, @NotNull FinishType finishType) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        Intrinsics.checkNotNullParameter(finishType, "finishType");
        a aVarRemove = cache.remove(new b(operation, sign));
        if (aVarRemove == null) {
            return;
        }
        aVarRemove.mo32881a(finishType);
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: d */
    public static final InterfaceC45062e m96611d(@NotNull String name, @NotNull String operation, @Nullable String sign, @Nullable String description, @Nullable String category) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(operation, "operation");
        b bVar = new b(operation, sign);
        InterfaceC45063f interfaceC45063f = performance;
        String operation2 = bVar.getOperation();
        if (description == null) {
            description = sign;
        }
        InterfaceC45062e interfaceC45062eMo32880b = interfaceC45063f.mo32880b(name, operation2, description, category);
        Map<b, a> map = cache;
        a aVar = map.get(bVar);
        if (aVar != null) {
            aVar.mo32881a(FinishType.UNAUTHENTICATED);
        }
        a aVar2 = new a(operation, sign, interfaceC45062eMo32880b);
        map.put(bVar, aVar2);
        C43840a.m96550d("startTransaction name:" + name + ' ' + bVar, TypedValues.TransitionType.NAME);
        C44128b.m97259c(TypedValues.TransitionType.NAME, "start name:" + name + ' ' + bVar + " [" + map.size() + ']');
        f96924a.m96612b();
        return aVar2;
    }

    /* JADX INFO: renamed from: b */
    public final void m96612b() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        Collection<a> collectionValues = cache.values();
        ArrayList arrayList = new ArrayList();
        for (Object obj : collectionValues) {
            if (((a) obj).m96614c(jCurrentTimeMillis)) {
                arrayList.add(obj);
            }
        }
        for (a aVar : CollectionsKt.toList(arrayList)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("timeout:");
            sb2.append(aVar);
            sb2.append(" [");
            Map<b, a> map = cache;
            sb2.append(map.size());
            sb2.append(']');
            C44128b.m97259c(TypedValues.TransitionType.NAME, sb2.toString());
            aVar.mo32881a(FinishType.UNAUTHENTICATED);
            map.remove(aVar.getKey());
        }
    }
}
