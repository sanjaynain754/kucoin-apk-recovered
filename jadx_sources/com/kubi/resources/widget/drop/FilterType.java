package com.kubi.resources.widget.drop;

import com.kubi.sdk.res.R$string;
import com.kubi.utils.C27059l;
import com.kubi.utils.extensions.C27041f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: FilterType.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\u0018\u0000 \u00062\u00020\u0001:\u0003\u0004\u0005\u0006B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, m90084d2 = {"Lcom/kubi/resources/widget/drop/FilterType;", "", "<init>", "()V", "IFilter", "Filter", "Companion", "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class FilterType {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final Companion f44543a = new Companion(null);

    /* JADX INFO: compiled from: FilterType.kt */
    @Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J3\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0016\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\b2\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\f¨\u0006\r"}, m90084d2 = {"Lcom/kubi/resources/widget/drop/FilterType$Companion;", "", "<init>", "()V", "convert2Filter", "", "Lcom/kubi/resources/widget/drop/FilterType$Filter;", "map", "", "", "addAll", "", "(Ljava/util/Map;Z)[Lcom/kubi/resources/widget/drop/FilterType$Filter;", "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nFilterType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FilterType.kt\ncom/kubi/resources/widget/drop/FilterType$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,54:1\n1869#2,2:55\n37#3:57\n36#3,3:58\n*S KotlinDebug\n*F\n+ 1 FilterType.kt\ncom/kubi/resources/widget/drop/FilterType$Companion\n*L\n40#1:55,2\n50#1:57\n50#1:58,3\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final C23032a[] convert2Filter(@Nullable Map<String, String> map, boolean z11) {
            if (map == null || map.isEmpty()) {
                return new C23032a[0];
            }
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = map.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                arrayList.add(new C23032a(C27041f.m66668h((String) entry.getValue()), (String) entry.getKey()));
            }
            if (z11) {
                String string = C27059l.f54343a.m66757a().getString(R$string.all);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                arrayList.add(0, new C23032a(string, ""));
            }
            return (C23032a[]) arrayList.toArray(new C23032a[0]);
        }

        public Companion() {
        }

        public static /* synthetic */ C23032a[] convert2Filter$default(Companion companion, Map map, boolean z11, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                z11 = true;
            }
            return companion.convert2Filter(map, z11);
        }
    }

    /* JADX INFO: renamed from: com.kubi.resources.widget.drop.FilterType$a */
    /* JADX INFO: compiled from: FilterType.kt */
    @Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0002\u001a\u00020\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\nR\u001a\u0010\r\u001a\u00020\u000eX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m90084d2 = {"Lcom/kubi/resources/widget/drop/FilterType$Filter;", "Lcom/kubi/resources/widget/drop/FilterType$IFilter;", "resId", "", "filterName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getResId", "()Ljava/lang/String;", "setResId", "(Ljava/lang/String;)V", "getFilterName", "setFilterName", "isCheck", "", "()Z", "setCheck", "(Z)V", "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C23032a implements InterfaceC23033b {

        /* JADX INFO: renamed from: a */
        @NotNull
        public String f44544a;

        /* JADX INFO: renamed from: b */
        @NotNull
        public String f44545b;

        /* JADX INFO: renamed from: c */
        public boolean f44546c;

        public C23032a(@NotNull String resId, @NotNull String filterName) {
            Intrinsics.checkNotNullParameter(resId, "resId");
            Intrinsics.checkNotNullParameter(filterName, "filterName");
            this.f44544a = resId;
            this.f44545b = filterName;
        }

        @Override // com.kubi.resources.widget.drop.FilterType.InterfaceC23033b
        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public String getF44545b() {
            return this.f44545b;
        }

        @Override // com.kubi.resources.widget.drop.FilterType.InterfaceC23033b
        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public String getF44544a() {
            return this.f44544a;
        }

        @Override // com.kubi.resources.widget.drop.FilterType.InterfaceC23033b
        /* JADX INFO: renamed from: c */
        public void mo55155c(boolean z11) {
            this.f44546c = z11;
        }

        @Override // com.kubi.resources.widget.drop.FilterType.InterfaceC23033b
        /* JADX INFO: renamed from: d, reason: from getter */
        public boolean getF44546c() {
            return this.f44546c;
        }
    }

    /* JADX INFO: renamed from: com.kubi.resources.widget.drop.FilterType$b */
    /* JADX INFO: compiled from: FilterType.kt */
    @Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0018\u0010\u0006\u001a\u00020\u0007X¦\u000e¢\u0006\f\u001a\u0004\b\u0006\u0010\b\"\u0004\b\t\u0010\nR\u0012\u0010\u000b\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\rÀ\u0006\u0001"}, m90084d2 = {"Lcom/kubi/resources/widget/drop/FilterType$IFilter;", "", "resId", "", "getResId", "()Ljava/lang/String;", "isCheck", "", "()Z", "setCheck", "(Z)V", "filterName", "getFilterName", "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public interface InterfaceC23033b {
        @NotNull
        /* JADX INFO: renamed from: a */
        String getF44545b();

        @NotNull
        /* JADX INFO: renamed from: b */
        String getF44544a();

        /* JADX INFO: renamed from: c */
        void mo55155c(boolean z11);

        /* JADX INFO: renamed from: d */
        boolean getF44546c();
    }
}
