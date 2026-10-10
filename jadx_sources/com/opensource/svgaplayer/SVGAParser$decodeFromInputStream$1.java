package com.opensource.svgaplayer;

import com.opensource.svgaplayer.proto.MovieEntity;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import k90.C40965c;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.p407io.CloseableKt;

/* JADX INFO: compiled from: SVGAParser.kt */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90082bv = {1, 0, 3}, m90083d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m90084d2 = {"<anonymous>", "", "run"}, m90085k = 3, m90086mv = {1, 1, 15})
public final class SVGAParser$decodeFromInputStream$1 implements Runnable {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ SVGAParser f55448b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ InputStream f55449c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ String f55450d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ SVGAParser.InterfaceC27307b f55451e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ String f55452f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ SVGAParser.InterfaceC27308c f55453g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ boolean f55454h;

    /* JADX INFO: renamed from: com.opensource.svgaplayer.SVGAParser$decodeFromInputStream$1$a */
    /* JADX INFO: compiled from: SVGAParser.kt */
    @Metadata(m90082bv = {1, 0, 3}, m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, m90084d2 = {"<anonymous>", "", "run", "com/opensource/svgaplayer/SVGAParser$decodeFromInputStream$1$1$2"}, m90085k = 3, m90086mv = {1, 1, 15})
    public static final class RunnableC27311a implements Runnable {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ byte[] f55455b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ SVGAParser$decodeFromInputStream$1 f55456c;

        public RunnableC27311a(byte[] bArr, SVGAParser$decodeFromInputStream$1 sVGAParser$decodeFromInputStream$1) {
            this.f55455b = bArr;
            this.f55456c = sVGAParser$decodeFromInputStream$1;
        }

        @Override // java.lang.Runnable
        public final void run() {
            File fileM67646e = SVGACache.f55407c.m67646e(this.f55456c.f55450d);
            try {
                File file = !fileM67646e.exists() ? fileM67646e : null;
                if (file != null) {
                    file.createNewFile();
                }
                new FileOutputStream(fileM67646e).write(this.f55455b);
                Unit unit = Unit.INSTANCE;
            } catch (Exception e11) {
                C40965c.f91057a.m89715c("SVGAParser", "create cache file fail.", e11);
                fileM67646e.delete();
            }
        }
    }

    public SVGAParser$decodeFromInputStream$1(SVGAParser sVGAParser, InputStream inputStream, String str, SVGAParser.InterfaceC27307b interfaceC27307b, String str2, SVGAParser.InterfaceC27308c interfaceC27308c, boolean z11) {
        this.f55448b = sVGAParser;
        this.f55449c = inputStream;
        this.f55450d = str;
        this.f55451e = interfaceC27307b;
        this.f55452f = str2;
        this.f55453g = interfaceC27308c;
        this.f55454h = z11;
    }

    @Override // java.lang.Runnable
    public final void run() throws IOException {
        try {
            try {
                byte[] bArrM67695B = this.f55448b.m67695B(this.f55449c);
                if (bArrM67695B == null) {
                    this.f55448b.m67706z(new Exception("readAsBytes(inputStream) cause exception"), this.f55451e, this.f55452f);
                } else if (this.f55448b.m67694A(bArrM67695B)) {
                    C40965c c40965c = C40965c.f91057a;
                    c40965c.m89717e("SVGAParser", "decode from zip file");
                    SVGACache sVGACache = SVGACache.f55407c;
                    if (!sVGACache.m67643b(this.f55450d).exists() || C27325g.f55525b) {
                        synchronized (Integer.valueOf(C27325g.f55524a)) {
                            if (!sVGACache.m67643b(this.f55450d).exists()) {
                                C27325g.f55525b = true;
                                c40965c.m89717e("SVGAParser", "no cached, prepare to unzip");
                                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrM67695B);
                                try {
                                    this.f55448b.m67696C(byteArrayInputStream, this.f55450d);
                                    C27325g.f55525b = false;
                                    c40965c.m89717e("SVGAParser", "unzip success");
                                    Unit unit = Unit.INSTANCE;
                                    CloseableKt.closeFinally(byteArrayInputStream, null);
                                } catch (Throwable th2) {
                                    try {
                                        throw th2;
                                    } catch (Throwable th3) {
                                        CloseableKt.closeFinally(byteArrayInputStream, th2);
                                        throw th3;
                                    }
                                }
                            }
                            Unit unit2 = Unit.INSTANCE;
                        }
                    }
                    this.f55448b.m67698q(this.f55450d, this.f55451e, this.f55452f);
                } else {
                    if (!SVGACache.f55407c.m67650i()) {
                        SVGAParser.INSTANCE.getThreadPoolExecutor$com_opensource_svgaplayer().execute(new RunnableC27311a(bArrM67695B, this));
                    }
                    C40965c c40965c2 = C40965c.f91057a;
                    c40965c2.m89717e("SVGAParser", "inflate start");
                    byte[] bArrM67703w = this.f55448b.m67703w(bArrM67695B);
                    if (bArrM67703w != null) {
                        c40965c2.m89717e("SVGAParser", "inflate complete");
                        MovieEntity movieEntityDecode = MovieEntity.ADAPTER.decode(bArrM67703w);
                        Intrinsics.checkExpressionValueIsNotNull(movieEntityDecode, "MovieEntity.ADAPTER.decode(it)");
                        final SVGAVideoEntity sVGAVideoEntity = new SVGAVideoEntity(movieEntityDecode, new File(this.f55450d), this.f55448b.mFrameWidth, this.f55448b.mFrameHeight);
                        c40965c2.m89717e("SVGAParser", "SVGAVideoEntity prepare start");
                        sVGAVideoEntity.m67732u(new Function0<Unit>() { // from class: com.opensource.svgaplayer.SVGAParser$decodeFromInputStream$1$$special$$inlined$let$lambda$3
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
                                SVGAParser$decodeFromInputStream$1 sVGAParser$decodeFromInputStream$1 = this;
                                sVGAParser$decodeFromInputStream$1.f55448b.m67705y(sVGAVideoEntity, sVGAParser$decodeFromInputStream$1.f55451e, sVGAParser$decodeFromInputStream$1.f55452f);
                            }
                        }, this.f55453g);
                    } else {
                        this.f55448b.m67706z(new Exception("inflate(bytes) cause exception"), this.f55451e, this.f55452f);
                    }
                }
                if (this.f55454h) {
                    this.f55449c.close();
                }
                C40965c.f91057a.m89717e("SVGAParser", "================ decode " + this.f55452f + " from input stream end ================");
            } catch (Throwable th4) {
                if (this.f55454h) {
                    this.f55449c.close();
                }
                C40965c.f91057a.m89717e("SVGAParser", "================ decode " + this.f55452f + " from input stream end ================");
                throw th4;
            }
        } catch (Exception e11) {
            this.f55448b.m67706z(e11, this.f55451e, this.f55452f);
            if (this.f55454h) {
                this.f55449c.close();
            }
            C40965c.f91057a.m89717e("SVGAParser", "================ decode " + this.f55452f + " from input stream end ================");
        }
    }
}
