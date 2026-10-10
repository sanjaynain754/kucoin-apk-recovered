package p234ek;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.kubi.httpdns.HttpDnsConfig;
import com.kubi.httpdns.exception.InterpretException;
import com.kubi.httpdns.interpret.ClientControlImpl;
import com.kubi.httpdns.interpret.InterpretExistException;
import org.jetbrains.annotations.NotNull;
import p345ik.C38656d;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: ek.g */
/* JADX INFO: compiled from: InterpretServiceImpl.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000eR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, m90084d2 = {"Lek/g;", "Lek/d;", "Lcom/kubi/httpdns/HttpDnsConfig;", "config", "Lek/b;", "Lek/c;", "categoryController", "<init>", "(Lcom/kubi/httpdns/HttpDnsConfig;Lek/b;)V", "Lek/e;", "request", "Lek/f;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lek/e;)Lek/f;", "Lcom/kubi/httpdns/HttpDnsConfig;", "b", "Lek/b;", "Lik/d;", "c", "Lik/d;", "interpretRecorder", "httpdns_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class C37209g implements InterfaceC37206d {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final HttpDnsConfig config;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC37204b<InterfaceC37205c> categoryController;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final C38656d interpretRecorder;

    public C37209g(@NotNull HttpDnsConfig config, @NotNull InterfaceC37204b<InterfaceC37205c> categoryController) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(categoryController, "categoryController");
        this.config = config;
        this.categoryController = categoryController;
        this.interpretRecorder = new C38656d();
    }

    @Override // p234ek.InterfaceC37206d
    @NotNull
    /* JADX INFO: renamed from: a */
    public C37208f mo83243a(@NotNull C37207e request) throws InterpretException {
        Intrinsics.checkNotNullParameter(request, "request");
        try {
            if (!this.interpretRecorder.m87391a(request.getHost())) {
                throw new InterpretExistException();
            }
            try {
                return this.categoryController.mo31469a().mo83241a(request);
            } finally {
                this.interpretRecorder.m87392b(request.getHost());
            }
        } catch (Throwable th2) {
            throw new InterpretException(th2);
        }
    }

    public /* synthetic */ C37209g(HttpDnsConfig httpDnsConfig, InterfaceC37204b interfaceC37204b, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(httpDnsConfig, (i11 & 2) != 0 ? new ClientControlImpl(httpDnsConfig) : interfaceC37204b);
    }
}
