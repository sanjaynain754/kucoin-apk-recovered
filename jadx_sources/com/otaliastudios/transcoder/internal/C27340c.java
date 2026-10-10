package com.otaliastudios.transcoder.internal;

import aa0.InterfaceC0214b;
import android.media.MediaFormat;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.otaliastudios.transcoder.common.TrackStatus;
import com.otaliastudios.transcoder.common.TrackType;
import com.otaliastudios.transcoder.internal.pipeline.Pipeline;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function4;
import p852kotlin.jvm.internal.Intrinsics;
import w90.C45770i;
import w90.C45774m;
import w90.InterfaceC45771j;

/* JADX INFO: renamed from: com.otaliastudios.transcoder.internal.c */
/* JADX INFO: compiled from: Segments.kt */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012$\u0010\f\u001a \u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u000f\u001a\u00020\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u0019\u0010\u001aJ!\u0010\u001c\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010!R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R2\u0010\f\u001a \u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010$R\u0014\u0010'\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010&R\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00150(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010)R\u001d\u0010,\u001a\b\u0012\u0004\u0012\u00020\b0(8\u0006¢\u0006\f\n\u0004\b\u0019\u0010)\u001a\u0004\b\"\u0010+R\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00020\b0(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010)¨\u0006."}, m90084d2 = {"Lcom/otaliastudios/transcoder/internal/c;", "", "Lcom/otaliastudios/transcoder/internal/a;", "sources", "Lcom/otaliastudios/transcoder/internal/e;", "tracks", "Lkotlin/Function4;", "Lcom/otaliastudios/transcoder/common/TrackType;", "", "Lcom/otaliastudios/transcoder/common/TrackStatus;", "Landroid/media/MediaFormat;", "Lcom/otaliastudios/transcoder/internal/pipeline/Pipeline;", "factory", "<init>", "(Lcom/otaliastudios/transcoder/internal/a;Lcom/otaliastudios/transcoder/internal/e;Lkotlin/jvm/functions/Function4;)V", "type", "", "d", "(Lcom/otaliastudios/transcoder/common/TrackType;)Z", "c", "()Z", "Lcom/otaliastudios/transcoder/internal/b;", "e", "(Lcom/otaliastudios/transcoder/common/TrackType;)Lcom/otaliastudios/transcoder/internal/b;", "", "f", "()V", "index", "g", "(Lcom/otaliastudios/transcoder/common/TrackType;I)Lcom/otaliastudios/transcoder/internal/b;", "segment", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lcom/otaliastudios/transcoder/internal/b;)V", "Lcom/otaliastudios/transcoder/internal/a;", "b", "Lcom/otaliastudios/transcoder/internal/e;", "Lkotlin/jvm/functions/Function4;", "Lw90/i;", "Lw90/i;", "log", "Lw90/j;", "Lw90/j;", "current", "()Lw90/j;", "currentIndex", "requestedIndex", "lib_release"}, m90085k = 1, m90086mv = {1, 5, 1}, m90088xi = 48)
public final class C27340c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final C27335a sources;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final C27352e tracks;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final Function4<TrackType, Integer, TrackStatus, MediaFormat, Pipeline> factory;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final C45770i log;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC45771j<C27339b> current;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC45771j<Integer> currentIndex;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC45771j<Integer> requestedIndex;

    /* JADX INFO: renamed from: com.otaliastudios.transcoder.internal.c$a */
    /* JADX INFO: compiled from: Segments.kt */
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

    @NotNull
    /* JADX INFO: renamed from: b */
    public final InterfaceC45771j<Integer> m67952b() {
        return this.currentIndex;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m67953c() {
        return m67954d(TrackType.VIDEO) || m67954d(TrackType.AUDIO);
    }

    /* JADX INFO: renamed from: f */
    public final void m67956f() {
        C27339b c27339bMo67882q = this.current.mo67882q();
        if (c27339bMo67882q != null) {
            m67951a(c27339bMo67882q);
        }
        C27339b c27339bMo67872J = this.current.mo67872J();
        if (c27339bMo67872J == null) {
            return;
        }
        m67951a(c27339bMo67872J);
    }

    /* JADX INFO: renamed from: g */
    public final C27339b m67957g(TrackType type, int index) {
        TrackType trackType;
        List<InterfaceC0214b> listMo67873M;
        InterfaceC0214b interfaceC0214b = (InterfaceC0214b) CollectionsKt.getOrNull(this.sources.mo67873M(type), index);
        if (interfaceC0214b == null) {
            return null;
        }
        this.log.m101066c("tryCreateSegment(" + type + ", " + index + "): created!");
        if (this.tracks.m68034a().mo67884w(type)) {
            interfaceC0214b.mo792e(type);
            int i11 = a.$EnumSwitchMapping$0[type.ordinal()];
            if (i11 == 1) {
                trackType = TrackType.VIDEO;
            } else {
                if (i11 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                trackType = TrackType.AUDIO;
            }
            if (this.tracks.m68034a().mo67884w(trackType) && ((listMo67873M = this.sources.mo67873M(trackType)) == null || !listMo67873M.isEmpty())) {
                Iterator<T> it = listMo67873M.iterator();
                while (it.hasNext()) {
                    if (((InterfaceC0214b) it.next()) == interfaceC0214b) {
                        interfaceC0214b.mo792e(trackType);
                        break;
                    }
                }
            }
        }
        this.currentIndex.mo101054z(type, Integer.valueOf(index));
        C27339b c27339b = new C27339b(type, index, this.factory.invoke(type, Integer.valueOf(index), this.tracks.m68035b().mo67873M(type), this.tracks.m68036c().mo67873M(type)));
        this.current.mo101054z(type, c27339b);
        return c27339b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C27340c(@NotNull C27335a sources, @NotNull C27352e tracks, @NotNull Function4<? super TrackType, ? super Integer, ? super TrackStatus, ? super MediaFormat, Pipeline> factory) {
        Intrinsics.checkNotNullParameter(sources, "sources");
        Intrinsics.checkNotNullParameter(tracks, "tracks");
        Intrinsics.checkNotNullParameter(factory, "factory");
        this.sources = sources;
        this.tracks = tracks;
        this.factory = factory;
        this.log = new C45770i("Segments");
        this.current = C45774m.m101097b(null, null);
        this.currentIndex = C45774m.m101097b(-1, -1);
        this.requestedIndex = C45774m.m101097b(0, 0);
    }

    /* JADX INFO: renamed from: a */
    public final void m67951a(C27339b segment) {
        segment.m67950e();
        InterfaceC0214b interfaceC0214b = this.sources.mo67873M(segment.getType()).get(segment.getIndex());
        if (this.tracks.m68034a().mo67884w(segment.getType())) {
            interfaceC0214b.mo790c(segment.getType());
        }
        this.requestedIndex.mo101054z(segment.getType(), Integer.valueOf(segment.getIndex() + 1));
    }

    /* JADX INFO: renamed from: d */
    public final boolean m67954d(@NotNull TrackType type) {
        Integer numValueOf;
        Boolean boolValueOf;
        Intrinsics.checkNotNullParameter(type, "type");
        if (!this.sources.mo67884w(type)) {
            return false;
        }
        C45770i c45770i = this.log;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("hasNext(");
        sb2.append(type);
        sb2.append("): segment=");
        sb2.append(this.current.mo67883u(type));
        sb2.append(" lastIndex=");
        List<? extends InterfaceC0214b> listMo67883u = this.sources.mo67883u(type);
        Integer numValueOf2 = null;
        if (listMo67883u == null) {
            numValueOf = null;
        } else {
            numValueOf = Integer.valueOf(CollectionsKt.getLastIndex(listMo67883u));
        }
        sb2.append(numValueOf);
        sb2.append(" canAdvance=");
        C27339b c27339bMo67883u = this.current.mo67883u(type);
        if (c27339bMo67883u == null) {
            boolValueOf = null;
        } else {
            boolValueOf = Boolean.valueOf(c27339bMo67883u.m67947b());
        }
        sb2.append(boolValueOf);
        c45770i.m101070h(sb2.toString());
        C27339b c27339bMo67883u2 = this.current.mo67883u(type);
        if (c27339bMo67883u2 == null) {
            return true;
        }
        List<? extends InterfaceC0214b> listMo67883u2 = this.sources.mo67883u(type);
        if (listMo67883u2 != null) {
            numValueOf2 = Integer.valueOf(CollectionsKt.getLastIndex(listMo67883u2));
        }
        if (numValueOf2 == null) {
            return false;
        }
        int iIntValue = numValueOf2.intValue();
        if (!c27339bMo67883u2.m67947b() && c27339bMo67883u2.getIndex() >= iIntValue) {
            return false;
        }
        return true;
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public final C27339b m67955e(@NotNull TrackType type) {
        Intrinsics.checkNotNullParameter(type, "type");
        int iIntValue = this.currentIndex.mo67873M(type).intValue();
        int iIntValue2 = this.requestedIndex.mo67873M(type).intValue();
        if (iIntValue2 >= iIntValue) {
            if (iIntValue2 > iIntValue) {
                return m67957g(type, iIntValue2);
            }
            if (this.current.mo67873M(type).m67947b()) {
                return this.current.mo67873M(type);
            }
            m67951a(this.current.mo67873M(type));
            return m67955e(type);
        }
        throw new IllegalStateException(("Requested index " + iIntValue2 + " smaller than " + iIntValue + '.').toString());
    }
}
