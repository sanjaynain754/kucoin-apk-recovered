package com.otaliastudios.transcoder.internal;

import aa0.C0213a;
import aa0.InterfaceC0214b;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.otaliastudios.transcoder.common.TrackType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;
import q90.C43671b;
import q90.C43674e;
import w90.C45770i;
import w90.InterfaceC45773l;

/* JADX INFO: renamed from: com.otaliastudios.transcoder.internal.a */
/* JADX INFO: compiled from: DataSources.kt */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B%\b\u0002\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\nB\u0011\b\u0016\u0012\u0006\u0010\t\u001a\u00020\u000b¢\u0006\u0004\b\u0006\u0010\fJ\u001e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u0016*\u00020\u0003H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0013\u0010\u001b\u001a\u00020\u0016*\u00020\u0003H\u0002¢\u0006\u0004\b\u001b\u0010\u001aJ\u0019\u0010\u001c\u001a\u00020\u0016*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0019\u0010\u001e\u001a\u00020\u0016*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002¢\u0006\u0004\b\u001e\u0010\u001dR\u0014\u0010\"\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00030#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010$R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010$R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010$¨\u0006&"}, m90084d2 = {"Lcom/otaliastudios/transcoder/internal/a;", "Lw90/l;", "", "Laa0/b;", "videoSources", "audioSources", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "Lq90/e;", "options", "(Lq90/e;)V", "Lq90/b;", "(Lq90/b;)V", "Lcom/otaliastudios/transcoder/common/TrackType;", "type", "e", "(Lcom/otaliastudios/transcoder/common/TrackType;)Ljava/util/List;", "", "w", "(Lcom/otaliastudios/transcoder/common/TrackType;)Z", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "()Ljava/util/List;", "", "release", "()V", "i", "(Laa0/b;)V", "c", "j", "(Ljava/util/List;)V", "d", "Lw90/i;", "b", "Lw90/i;", "log", "", "Ljava/util/List;", "discarded", "lib_release"}, m90085k = 1, m90086mv = {1, 5, 1}, m90088xi = 48)
public final class C27335a implements InterfaceC45773l<List<? extends InterfaceC0214b>> {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final C45770i log;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final List<InterfaceC0214b> discarded;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final List<InterfaceC0214b> videoSources;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final List<InterfaceC0214b> audioSources;

    public C27335a(List<? extends InterfaceC0214b> list, List<? extends InterfaceC0214b> list2) {
        int i11;
        List list3;
        List arrayList;
        List list4;
        C45770i c45770i = new C45770i("DataSources");
        this.log = c45770i;
        c45770i.m101066c("initializing videoSources...");
        m67908j(list);
        c45770i.m101066c("initializing audioSources...");
        m67908j(list2);
        this.discarded = new ArrayList();
        int i12 = 0;
        if (list == null || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            i11 = 0;
            while (it.hasNext()) {
                if (((InterfaceC0214b) it.next()).mo791d(TrackType.VIDEO) != null && (i11 = i11 + 1) < 0) {
                    CollectionsKt.throwCountOverflow();
                }
            }
        } else {
            i11 = 0;
        }
        if (i11 == 0) {
            List listEmptyList = CollectionsKt.emptyList();
            CollectionsKt.addAll(this.discarded, list);
            list3 = listEmptyList;
        } else {
            list.size();
            list3 = list;
        }
        this.videoSources = list3;
        if (list2 == null || !list2.isEmpty()) {
            Iterator<T> it2 = list2.iterator();
            int i13 = 0;
            while (it2.hasNext()) {
                if ((((InterfaceC0214b) it2.next()).mo791d(TrackType.AUDIO) != null) && (i13 = i13 + 1) < 0) {
                    CollectionsKt.throwCountOverflow();
                }
            }
            i12 = i13;
        }
        this.log.m101066c(Intrinsics.stringPlus("computing audioSources, valid=", Integer.valueOf(i12)));
        if (i12 != 0) {
            if (i12 != list2.size()) {
                list4 = list2;
                arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
                for (InterfaceC0214b interfaceC0214b : list2) {
                    if (interfaceC0214b.mo791d(TrackType.AUDIO) == null) {
                        C0213a c0213a = new C0213a(interfaceC0214b.getDurationUs());
                        this.discarded.add(interfaceC0214b);
                        interfaceC0214b = c0213a;
                    }
                    arrayList.add(interfaceC0214b);
                }
            }
            list4 = list2;
            this.audioSources = list4;
        }
        arrayList = CollectionsKt.emptyList();
        CollectionsKt.addAll(this.discarded, list2);
        list4 = arrayList;
        list4 = list2;
        this.audioSources = list4;
    }

    /* JADX INFO: renamed from: com.otaliastudios.transcoder.internal.a$a */
    /* JADX INFO: compiled from: DataSources.kt */
    @Metadata(m90085k = 3, m90086mv = {1, 5, 1}, m90088xi = 48)
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TrackType.values().length];
            iArr[TrackType.AUDIO.ordinal()] = 1;
            iArr[TrackType.VIDEO.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public final void release() {
        this.log.m101066c("release(): releasing...");
        m67902d(mo67880o());
        m67902d(mo67881p());
        m67902d(this.discarded);
        this.log.m101066c("release(): released.");
    }

    @Override // w90.InterfaceC45773l
    /* JADX INFO: renamed from: C */
    public boolean mo67870C() {
        return InterfaceC45773l.a.m101090d(this);
    }

    @Override // w90.InterfaceC45773l
    /* JADX INFO: renamed from: E */
    public boolean mo67871E() {
        return InterfaceC45773l.a.m101089c(this);
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final List<InterfaceC0214b> m67899a() {
        return CollectionsKt.distinct(CollectionsKt.plus((Collection) mo67881p(), (Iterable) mo67880o()));
    }

    @Override // w90.InterfaceC45773l
    @Nullable
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public List<InterfaceC0214b> mo67872J() {
        return (List) InterfaceC45773l.a.m101087a(this);
    }

    /* JADX INFO: renamed from: c */
    public final void m67901c(InterfaceC0214b interfaceC0214b) {
        if (interfaceC0214b.isInitialized()) {
            interfaceC0214b.mo794g();
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m67902d(List<? extends InterfaceC0214b> list) {
        for (InterfaceC0214b interfaceC0214b : list) {
            this.log.m101066c("deinitializing " + interfaceC0214b + "... (isInit=" + interfaceC0214b.isInitialized() + ')');
            m67901c(interfaceC0214b);
        }
    }

    @Override // w90.InterfaceC45773l
    @NotNull
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public List<InterfaceC0214b> mo67873M(@NotNull TrackType type) {
        Intrinsics.checkNotNullParameter(type, "type");
        int i11 = a.$EnumSwitchMapping$0[type.ordinal()];
        if (i11 != 1) {
            if (i11 == 2) {
                return this.videoSources;
            }
            throw new NoWhenBranchMatchedException();
        }
        return this.audioSources;
    }

    @Override // w90.InterfaceC45773l
    @NotNull
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public List<InterfaceC0214b> mo67881p() {
        return (List) InterfaceC45773l.a.m101088b(this);
    }

    @Override // w90.InterfaceC45773l
    @Nullable
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public List<InterfaceC0214b> mo67883u(@NotNull TrackType trackType) {
        return (List) InterfaceC45773l.a.m101091e(this, trackType);
    }

    @Override // w90.InterfaceC45773l
    public int getSize() {
        return InterfaceC45773l.a.m101092f(this);
    }

    @Override // w90.InterfaceC45773l
    @NotNull
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public List<InterfaceC0214b> mo67880o() {
        return (List) InterfaceC45773l.a.m101093g(this);
    }

    /* JADX INFO: renamed from: i */
    public final void m67907i(InterfaceC0214b interfaceC0214b) {
        if (!interfaceC0214b.isInitialized()) {
            interfaceC0214b.initialize();
        }
    }

    @Override // java.lang.Iterable
    @NotNull
    public Iterator<List<InterfaceC0214b>> iterator() {
        return InterfaceC45773l.a.m101094h(this);
    }

    /* JADX INFO: renamed from: j */
    public final void m67908j(List<? extends InterfaceC0214b> list) {
        for (InterfaceC0214b interfaceC0214b : list) {
            this.log.m101066c("initializing " + interfaceC0214b + "... (isInit=" + interfaceC0214b.isInitialized() + ')');
            m67907i(interfaceC0214b);
        }
    }

    @Override // w90.InterfaceC45773l
    @Nullable
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public List<InterfaceC0214b> mo67882q() {
        return (List) InterfaceC45773l.a.m101095i(this);
    }

    @Override // w90.InterfaceC45773l
    /* JADX INFO: renamed from: w */
    public boolean mo67884w(@NotNull TrackType type) {
        Intrinsics.checkNotNullParameter(type, "type");
        return !mo67873M(type).isEmpty();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C27335a(@NotNull C43674e options) {
        Intrinsics.checkNotNullParameter(options, "options");
        List<InterfaceC0214b> listM96119v = options.m96119v();
        Intrinsics.checkNotNullExpressionValue(listM96119v, "options.videoDataSources");
        List<InterfaceC0214b> listM96110m = options.m96110m();
        Intrinsics.checkNotNullExpressionValue(listM96110m, "options.audioDataSources");
        this(listM96119v, listM96110m);
    }

    public C27335a(@NotNull C43671b options) {
        Intrinsics.checkNotNullParameter(options, "options");
        throw null;
    }
}
