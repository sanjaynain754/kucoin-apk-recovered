package ac0;

import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;

/* JADX INFO: renamed from: ac0.d */
/* JADX INFO: compiled from: MethodCallOperation.java */
/* JADX INFO: loaded from: classes23.dex */
public class C0234d extends AbstractC0231a {

    /* JADX INFO: renamed from: a */
    public final a f697a;

    /* JADX INFO: renamed from: b */
    public final MethodCall f698b;

    /* JADX INFO: renamed from: ac0.d$a */
    /* JADX INFO: compiled from: MethodCallOperation.java */
    public class a implements InterfaceC0236f {

        /* JADX INFO: renamed from: a */
        public final MethodChannel.Result f699a;

        public a(MethodChannel.Result result) {
            this.f699a = result;
        }

        @Override // ac0.InterfaceC0236f
        public void error(String str, String str2, Object obj) {
            this.f699a.error(str, str2, obj);
        }

        @Override // ac0.InterfaceC0236f
        public void success(Object obj) {
            this.f699a.success(obj);
        }
    }

    @Override // ac0.InterfaceC0235e
    /* JADX INFO: renamed from: a */
    public <T> T mo863a(String str) {
        return (T) this.f698b.argument(str);
    }

    @Override // ac0.InterfaceC0235e
    /* JADX INFO: renamed from: b */
    public boolean mo864b(String str) {
        return this.f698b.hasArgument(str);
    }

    @Override // ac0.InterfaceC0235e
    public String getMethod() {
        return this.f698b.method;
    }

    @Override // ac0.AbstractC0231a
    /* JADX INFO: renamed from: l */
    public InterfaceC0236f mo853l() {
        return this.f697a;
    }

    public C0234d(MethodCall methodCall, MethodChannel.Result result) {
        this.f698b = methodCall;
        this.f697a = new a(result);
    }
}
