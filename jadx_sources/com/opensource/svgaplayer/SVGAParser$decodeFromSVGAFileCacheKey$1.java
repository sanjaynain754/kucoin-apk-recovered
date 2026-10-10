package com.opensource.svgaplayer;

import com.opensource.svgaplayer.proto.MovieEntity;
import java.io.File;
import java.io.FileInputStream;
import k90.C40965c;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.p407io.CloseableKt;

/* JADX INFO: compiled from: SVGAParser.kt */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90082bv = {1, 0, 3}, m90083d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m90084d2 = {"<anonymous>", "", "run"}, m90085k = 3, m90086mv = {1, 1, 15})
public final class SVGAParser$decodeFromSVGAFileCacheKey$1 implements Runnable {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ SVGAParser f55457b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f55458c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ String f55459d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ SVGAParser.InterfaceC27307b f55460e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ SVGAParser.InterfaceC27308c f55461f;

    public SVGAParser$decodeFromSVGAFileCacheKey$1(SVGAParser sVGAParser, String str, String str2, SVGAParser.InterfaceC27307b interfaceC27307b, SVGAParser.InterfaceC27308c interfaceC27308c) {
        this.f55457b = sVGAParser;
        this.f55458c = str;
        this.f55459d = str2;
        this.f55460e = interfaceC27307b;
        this.f55461f = interfaceC27308c;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            try {
                C40965c c40965c = C40965c.f91057a;
                c40965c.m89717e("SVGAParser", "================ decode " + this.f55458c + " from svga cachel file to entity ================");
                FileInputStream fileInputStream = new FileInputStream(SVGACache.f55407c.m67646e(this.f55459d));
                try {
                    byte[] bArrM67695B = this.f55457b.m67695B(fileInputStream);
                    if (bArrM67695B == null) {
                        this.f55457b.m67706z(new Exception("readAsBytes(inputStream) cause exception"), this.f55460e, this.f55458c);
                    } else if (this.f55457b.m67694A(bArrM67695B)) {
                        this.f55457b.m67698q(this.f55459d, this.f55460e, this.f55458c);
                    } else {
                        c40965c.m89717e("SVGAParser", "inflate start");
                        byte[] bArrM67703w = this.f55457b.m67703w(bArrM67695B);
                        if (bArrM67703w != null) {
                            c40965c.m89717e("SVGAParser", "inflate complete");
                            MovieEntity movieEntityDecode = MovieEntity.ADAPTER.decode(bArrM67703w);
                            Intrinsics.checkExpressionValueIsNotNull(movieEntityDecode, "MovieEntity.ADAPTER.decode(it)");
                            final SVGAVideoEntity sVGAVideoEntity = new SVGAVideoEntity(movieEntityDecode, new File(this.f55459d), this.f55457b.mFrameWidth, this.f55457b.mFrameHeight);
                            c40965c.m89717e("SVGAParser", "SVGAVideoEntity prepare start");
                            sVGAVideoEntity.m67732u(new Function0<Unit>() { // from class: com.opensource.svgaplayer.SVGAParser$decodeFromSVGAFileCacheKey$1$$special$$inlined$use$lambda$1
                                @Override // p852kotlin.jvm.functions.Function0
                                public /* bridge */ /* synthetic */ Unit invoke() {
                                    invoke2();
                                    return Unit.INSTANCE;
                                }

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2() {
                                    C40965c.f91057a.m89717e("SVGAParser", "SVGAVideoEntity prepare success");
                                    SVGAParser$decodeFromSVGAFileCacheKey$1 sVGAParser$decodeFromSVGAFileCacheKey$1 = this;
                                    sVGAParser$decodeFromSVGAFileCacheKey$1.f55457b.m67705y(sVGAVideoEntity, sVGAParser$decodeFromSVGAFileCacheKey$1.f55460e, sVGAParser$decodeFromSVGAFileCacheKey$1.f55458c);
                                }
                            }, this.f55461f);
                        } else {
                            this.f55457b.m67706z(new Exception("inflate(bytes) cause exception"), this.f55460e, this.f55458c);
                        }
                    }
                    Unit unit = Unit.INSTANCE;
                    CloseableKt.closeFinally(fileInputStream, null);
                    c40965c.m89717e("SVGAParser", "================ decode " + this.f55458c + " from svga cachel file to entity end ================");
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        CloseableKt.closeFinally(fileInputStream, th2);
                        throw th3;
                    }
                }
            } catch (Throwable th4) {
                C40965c.f91057a.m89717e("SVGAParser", "================ decode " + this.f55458c + " from svga cachel file to entity end ================");
                throw th4;
            }
        } catch (Exception e11) {
            this.f55457b.m67706z(e11, this.f55460e, this.f55458c);
            C40965c.f91057a.m89717e("SVGAParser", "================ decode " + this.f55458c + " from svga cachel file to entity end ================");
        }
    }
}
