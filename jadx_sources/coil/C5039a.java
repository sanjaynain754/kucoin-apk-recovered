package coil;

import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import java.util.Collection;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p648u0.InterfaceC45087a;
import p679v0.InterfaceC45342d;
import p709w0.InterfaceC45673b;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.PublishedApi;
import p852kotlin.TuplesKt;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: coil.a */
/* JADX INFO: compiled from: ComponentRegistry.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001:\u0001\u0013BÁ\u0001\b\u0002\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0002\u0012P\u0010\b\u001aL\u0012$\u0012\"\u0012\u0010\u0012\u000e\u0012\u0006\b\u0001\u0012\u00020\u0001\u0012\u0002\b\u00030\u0005\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u00060\u00040\u0002j\"\u0012\u0010\u0012\u000e\u0012\u0006\b\u0001\u0012\u00020\u0001\u0012\u0002\b\u00030\u0005\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0006`\u0007\u0012H\u0010\n\u001aD\u0012 \u0012\u001e\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\t\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u00060\u00040\u0002j\u001e\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\t\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0006`\u0007\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0002¢\u0006\u0004\b\r\u0010\u000eB\t\b\u0016¢\u0006\u0004\b\r\u0010\u000fJ\r\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012R \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016Rd\u0010\b\u001aL\u0012$\u0012\"\u0012\u0010\u0012\u000e\u0012\u0006\b\u0001\u0012\u00020\u0001\u0012\u0002\b\u00030\u0005\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u00060\u00040\u0002j\"\u0012\u0010\u0012\u000e\u0012\u0006\b\u0001\u0012\u00020\u0001\u0012\u0002\b\u00030\u0005\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0006`\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R\\\u0010\n\u001aD\u0012 \u0012\u001e\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\t\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u00060\u00040\u0002j\u001e\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\t\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0006`\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016R \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0013\u0010\u0016¨\u0006\u0019"}, m90084d2 = {"Lcoil/a;", "", "", "interceptors", "Lkotlin/Pair;", "Lw0/b;", "Ljava/lang/Class;", "Lcoil/util/MultiList;", "mappers", "Lv0/d;", "fetchers", "Lu0/a;", "decoders", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "()V", "Lcoil/a$a;", "e", "()Lcoil/a$a;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Ljava/util/List;", "c", "()Ljava/util/List;", "b", "d", "coil-base_release"}, m90085k = 1, m90086mv = {1, 5, 1}, m90088xi = 48)
public final class C5039a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final List<Object> interceptors;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final List<Pair<InterfaceC45673b<? extends Object, ?>, Class<? extends Object>>> mappers;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final List<Pair<InterfaceC45342d<? extends Object>, Class<? extends Object>>> fetchers;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final List<InterfaceC45087a> decoders;

    /* JADX INFO: renamed from: coil.a$a */
    /* JADX INFO: compiled from: ComponentRegistry.kt */
    @Metadata(m90083d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J9\u0010\u000b\u001a\u00020\u0000\"\b\b\u0000\u0010\u0006*\u00020\u00012\u0010\u0010\b\u001a\f\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0001¢\u0006\u0004\b\u000b\u0010\fJ5\u0010\u000f\u001a\u00020\u0000\"\b\b\u0000\u0010\u0006*\u00020\u00012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u0002¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00010\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0018R^\u0010\u001c\u001aL\u0012$\u0012\"\u0012\u0010\u0012\u000e\u0012\u0006\b\u0001\u0012\u00020\u0001\u0012\u0002\b\u00030\u0007\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\t0\u001a0\u0017j\"\u0012\u0010\u0012\u000e\u0012\u0006\b\u0001\u0012\u00020\u0001\u0012\u0002\b\u00030\u0007\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\t`\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0018RV\u0010\u001d\u001aD\u0012 \u0012\u001e\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\r\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\t0\u001a0\u0017j\u001e\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\r\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\t`\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0018R\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00110\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0018¨\u0006\u001f"}, m90084d2 = {"Lcoil/a$a;", "", "Lcoil/a;", "registry", "<init>", "(Lcoil/a;)V", ExifInterface.GPS_DIRECTION_TRUE, "Lw0/b;", "mapper", "Ljava/lang/Class;", "type", "c", "(Lw0/b;Ljava/lang/Class;)Lcoil/a$a;", "Lv0/d;", "fetcher", "b", "(Lv0/d;Ljava/lang/Class;)Lcoil/a$a;", "Lu0/a;", "decoder", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lu0/a;)Lcoil/a$a;", "d", "()Lcoil/a;", "", "Ljava/util/List;", "interceptors", "Lkotlin/Pair;", "Lcoil/util/MultiMutableList;", "mappers", "fetchers", "decoders", "coil-base_release"}, m90085k = 1, m90086mv = {1, 5, 1}, m90088xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final List<Object> interceptors;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final List<Pair<InterfaceC45673b<? extends Object, ?>, Class<? extends Object>>> mappers;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @NotNull
        public final List<Pair<InterfaceC45342d<? extends Object>, Class<? extends Object>>> fetchers;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @NotNull
        public final List<InterfaceC45087a> decoders;

        @NotNull
        /* JADX INFO: renamed from: a */
        public final a m5455a(@NotNull InterfaceC45087a decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            this.decoders.add(decoder);
            return this;
        }

        @PublishedApi
        @NotNull
        /* JADX INFO: renamed from: b */
        public final <T> a m5456b(@NotNull InterfaceC45342d<T> fetcher, @NotNull Class<T> type) {
            Intrinsics.checkNotNullParameter(fetcher, "fetcher");
            Intrinsics.checkNotNullParameter(type, "type");
            this.fetchers.add(TuplesKt.m90091to(fetcher, type));
            return this;
        }

        @PublishedApi
        @NotNull
        /* JADX INFO: renamed from: c */
        public final <T> a m5457c(@NotNull InterfaceC45673b<T, ?> mapper, @NotNull Class<T> type) {
            Intrinsics.checkNotNullParameter(mapper, "mapper");
            Intrinsics.checkNotNullParameter(type, "type");
            this.mappers.add(TuplesKt.m90091to(mapper, type));
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: d */
        public final C5039a m5458d() {
            return new C5039a(CollectionsKt.toList(this.interceptors), CollectionsKt.toList(this.mappers), CollectionsKt.toList(this.fetchers), CollectionsKt.toList(this.decoders), null);
        }

        public a(@NotNull C5039a registry) {
            Intrinsics.checkNotNullParameter(registry, "registry");
            this.interceptors = CollectionsKt.toMutableList((Collection) registry.m5452c());
            this.mappers = CollectionsKt.toMutableList((Collection) registry.m5453d());
            this.fetchers = CollectionsKt.toMutableList((Collection) registry.m5451b());
            this.decoders = CollectionsKt.toMutableList((Collection) registry.m5450a());
        }
    }

    public /* synthetic */ C5039a(List list, List list2, List list3, List list4, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, list2, list3, list4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C5039a(List<Object> list, List<? extends Pair<? extends InterfaceC45673b<? extends Object, ?>, ? extends Class<? extends Object>>> list2, List<? extends Pair<? extends InterfaceC45342d<? extends Object>, ? extends Class<? extends Object>>> list3, List<? extends InterfaceC45087a> list4) {
        this.interceptors = list;
        this.mappers = list2;
        this.fetchers = list3;
        this.decoders = list4;
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final List<InterfaceC45087a> m5450a() {
        return this.decoders;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final List<Pair<InterfaceC45342d<? extends Object>, Class<? extends Object>>> m5451b() {
        return this.fetchers;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final List<Object> m5452c() {
        return this.interceptors;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final List<Pair<InterfaceC45673b<? extends Object, ?>, Class<? extends Object>>> m5453d() {
        return this.mappers;
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final a m5454e() {
        return new a(this);
    }

    public C5039a() {
        this(CollectionsKt.emptyList(), CollectionsKt.emptyList(), CollectionsKt.emptyList(), CollectionsKt.emptyList());
    }
}
