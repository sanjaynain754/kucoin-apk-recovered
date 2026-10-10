package a3d20260409;

import ai.advance.common.camera.GuardianCameraViewV2;
import ai.advance.common.camera.GuardianCameraViewV3;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import p277g.C37737c;
import p277g.C37739e;
import p277g.InterfaceC37735a;
import p387k.C40826a;
import p387k.C40828c;
import we0.C45819f;

/* JADX INFO: loaded from: classes23.dex */
class OOOoooooo extends GuardianCameraViewV3 {

    /* JADX INFO: renamed from: F */
    public C37739e f78F;

    /* JADX INFO: renamed from: a3d20260409.OOOoooooo$a */
    public interface InterfaceC0061a {
        /* JADX INFO: renamed from: a */
        void mo87a(boolean z11);
    }

    /* JADX INFO: renamed from: a3d20260409.OOOoooooo$b */
    public class C0062b implements GuardianCameraViewV2.InterfaceC0336g {

        /* JADX INFO: renamed from: b */
        public final int f79b = 2;

        /* JADX INFO: renamed from: c */
        public int f80c = 0;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ InterfaceC0061a f81d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ C37739e f82e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ int f83f;

        /* JADX INFO: renamed from: a3d20260409.OOOoooooo$b$a */
        public class a extends Thread {

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ byte[] f85b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ Camera.Size f86c;

            public a(byte[] bArr, Camera.Size size) {
                this.f85b = bArr;
                this.f86c = size;
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                Context context = OOOoooooo.this.getContext();
                int iM89331e = context instanceof Activity ? C40828c.m89331e(C0062b.this.f83f, (Activity) context) : 0;
                byte[] bArr = this.f85b;
                Camera.Size size = this.f86c;
                Bitmap bitmapM89323i = C40826a.m89323i(bArr, size.width, size.height, iM89331e, true, false);
                byte[] bArrM89315a = C40826a.m89315a(C40826a.m89325k(bitmapM89323i, j3d20260409.OOoooOO0000000()), C0109v.m545s(), j3d20260409.OOoooOO00000());
                bitmapM89323i.recycle();
                j3d20260409.Oo0O00O0000o(bArrM89315a);
                C45819f.m101227J().m83491G("bk_img_upd", C0062b.this.f82e);
                super.run();
            }
        }

        /* JADX INFO: renamed from: a3d20260409.OOOoooooo$b$b */
        public class b implements InterfaceC37735a<C37737c> {
            public b() {
            }

            @Override // p277g.InterfaceC37735a
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public C37737c mo92a() {
                return new C37737c.b("bk_img_cbk").m85075c("index", Integer.valueOf(C0062b.this.f80c)).m85076d();
            }
        }

        public C0062b(InterfaceC0061a interfaceC0061a, C37739e c37739e, int i11) {
            this.f81d = interfaceC0061a;
            this.f82e = c37739e;
            this.f83f = i11;
        }

        @Override // ai.advance.common.camera.GuardianCameraViewV2.InterfaceC0336g
        /* JADX INFO: renamed from: c */
        public void mo90c(byte[] bArr, Camera.Size size) {
            this.f80c++;
            C45819f.m101227J().m83490F(new b(), this.f82e);
            if (this.f80c == 2) {
                new a(bArr, size).start();
                this.f81d.mo87a(true);
            }
        }

        @Override // ai.advance.common.camera.GuardianCameraViewV2.InterfaceC0336g
        /* JADX INFO: renamed from: i */
        public void mo91i(Exception exc) {
            this.f81d.mo87a(false);
        }

        @Override // ai.advance.common.camera.GuardianCameraViewV2.InterfaceC0336g
        /* JADX INFO: renamed from: b */
        public void mo89b() {
        }

        @Override // ai.advance.common.camera.GuardianCameraViewV2.InterfaceC0336g
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }
    }

    /* JADX INFO: renamed from: H0 */
    public void m85H0(C37739e c37739e, InterfaceC0061a interfaceC0061a) {
        this.f78F = c37739e;
        C45819f.m101227J().m83491G("op_bk_start", c37739e);
        int iM89330d = C40828c.m89330d();
        mo415b0(iM89330d, new C0062b(interfaceC0061a, c37739e, iM89330d));
    }

    public OOOoooooo(Context context) {
        super(context);
    }

    @Override // ai.advance.common.camera.GuardianCameraViewV2
    /* JADX INFO: renamed from: L */
    public Camera.Size mo86L(Camera.Parameters parameters) {
        return parameters.getSupportedPreviewSizes().get(0);
    }
}
