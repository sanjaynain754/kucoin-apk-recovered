package com.horcrux.svg;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.module.annotations.ReactModule;

/* JADX INFO: loaded from: classes56.dex */
@ReactModule(name = "RNSVGSvgViewModule")
class SvgViewModule extends NativeSvgViewModuleSpec {
    public static final String NAME = "RNSVGSvgViewModule";

    /* JADX INFO: renamed from: com.horcrux.svg.SvgViewModule$a */
    public class RunnableC9227a implements Runnable {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f13103b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ ReadableMap f13104c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ Callback f13105d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ int f13106e;

        /* JADX INFO: renamed from: com.horcrux.svg.SvgViewModule$a$a */
        public class a implements Runnable {

            /* JADX INFO: renamed from: com.horcrux.svg.SvgViewModule$a$a$a, reason: collision with other inner class name */
            public class RunnableC46972a implements Runnable {
                public RunnableC46972a() {
                }

                @Override // java.lang.Runnable
                public void run() {
                    RunnableC9227a runnableC9227a = RunnableC9227a.this;
                    SvgViewModule.toDataURL(runnableC9227a.f13103b, runnableC9227a.f13104c, runnableC9227a.f13105d, runnableC9227a.f13106e + 1);
                }
            }

            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                SvgView svgViewByTag = SvgViewManager.getSvgViewByTag(RunnableC9227a.this.f13103b);
                if (svgViewByTag == null) {
                    return;
                }
                svgViewByTag.setToDataUrlTask(new RunnableC46972a());
            }
        }

        /* JADX INFO: renamed from: com.horcrux.svg.SvgViewModule$a$b */
        public class b implements Runnable {
            public b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                RunnableC9227a runnableC9227a = RunnableC9227a.this;
                SvgViewModule.toDataURL(runnableC9227a.f13103b, runnableC9227a.f13104c, runnableC9227a.f13105d, runnableC9227a.f13106e + 1);
            }
        }

        public RunnableC9227a(int i11, ReadableMap readableMap, Callback callback, int i12) {
            this.f13103b = i11;
            this.f13104c = readableMap;
            this.f13105d = callback;
            this.f13106e = i12;
        }

        @Override // java.lang.Runnable
        public void run() {
            SvgView svgViewByTag = SvgViewManager.getSvgViewByTag(this.f13103b);
            if (svgViewByTag == null) {
                SvgViewManager.runWhenViewIsAvailable(this.f13103b, new a());
                return;
            }
            if (svgViewByTag.notRendered()) {
                svgViewByTag.setToDataUrlTask(new b());
                return;
            }
            ReadableMap readableMap = this.f13104c;
            if (readableMap != null) {
                this.f13105d.invoke(svgViewByTag.toDataURL(readableMap.getInt("width"), this.f13104c.getInt("height")));
            } else {
                this.f13105d.invoke(svgViewByTag.toDataURL());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void toDataURL(int i11, ReadableMap readableMap, Callback callback, int i12) {
        UiThreadUtil.runOnUiThread(new RunnableC9227a(i11, readableMap, callback, i12));
    }

    @Override // com.horcrux.svg.NativeSvgViewModuleSpec, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RNSVGSvgViewModule";
    }

    @Override // com.horcrux.svg.NativeSvgViewModuleSpec
    @ReactMethod
    public void toDataURL(Double d11, ReadableMap readableMap, Callback callback) {
        toDataURL(d11.intValue(), readableMap, callback, 0);
    }

    public SvgViewModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }
}
