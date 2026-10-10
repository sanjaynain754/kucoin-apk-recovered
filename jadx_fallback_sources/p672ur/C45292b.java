package p672ur;

/* JADX INFO: renamed from: ur.b */
/* JADX INFO: compiled from: ConnectTrack.kt */
/* JADX INFO: loaded from: classes12.dex */
@kotlin.Metadata(m90083d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\n\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\bJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\bJ\u000f\u0010\f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\f\u0010\bJ\u0017\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0011\u0010\bJ\u000f\u0010\u0012\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0012\u0010\bJ\u0017\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0013\u0010\u0010J\u0017\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0018\u0010\bJ\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u0010J\u000f\u0010\u0019\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0019\u0010\bJ\u0017\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001b\u0010\u0005J\u0017\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001d\u0010\u0010J'\u0010\u001e\u001a\u00020\u00062\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0006H\u0002¢\u0006\u0004\b \u0010\bJ\u000f\u0010!\u001a\u00020\u0006H\u0002¢\u0006\u0004\b!\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\"R\u0016\u0010%\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010$R\u0016\u0010&\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010$R\u0016\u0010'\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010$R\u0016\u0010(\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010$R\u0016\u0010)\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010$R\u0016\u0010*\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010$R\u0016\u0010+\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010$R\u0016\u0010,\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010$R\u0016\u0010-\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010$R\u0016\u0010\u001a\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\"R\u0016\u00100\u001a\u00020.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010/R\u0014\u00104\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0018\u00107\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u0010:\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u00109¨\u0006;"}, m90084d2 = {"Lur/b;", "Lur/e;", "", "linkType", "<init>", "(Ljava/lang/String;)V", "", "b", "()V", "c", "g", "a", "k", "", "e", "l", "(Ljava/lang/Throwable;)V", "d", "h", "j", "Lcom/kubi/network/socket/model/TokenEntity;", "token", "f", "(Lcom/kubi/network/socket/model/TokenEntity;)V", "i", "v", "connectUrl", "q", "error", "r", "s", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "p", "o", "Ljava/lang/String;", "", "J", "callStart", "callEnd", "flowCount", "flowStart", "flowEnd", "tokenStart", "tokenEnd", "connectStart", "connectEnd", "", "Z", "callFore", "Ljava/lang/StringBuffer;", "m", "Ljava/lang/StringBuffer;", "callChain", "n", "Ljava/lang/Throwable;", "failExcept", "Lcom/kubi/network/socket/utils/i;", "Lcom/kubi/network/socket/utils/i;", "evaluator", "network-core-socket_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nConnectTrack.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConnectTrack.kt\ncom/kubi/network/socket/track/ConnectTrack\n+ 2 IConnectTrack.kt\ncom/kubi/network/socket/track/IConnectTrackKt\n+ 3 NetCoreSocketIssue.kt\ncom/kubi/network/socket/exception/NetCoreSocketIssueKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 TechnologyEvent.kt\ncom/kubi/monitor/TechnologyEvent\n+ 6 KunlunEvent.kt\ncom/kubi/monitor/KunlunEvent\n*L\n1#1,244:1\n84#2:245\n84#2:246\n84#2:247\n84#2:248\n84#2:249\n84#2:250\n84#2:251\n84#2:252\n84#2:253\n84#2:254\n84#2:255\n84#2:256\n52#3,33:257\n52#3,33:290\n1#4:323\n71#5,4:324\n74#6,12:328\n74#6,12:340\n*S KotlinDebug\n*F\n+ 1 ConnectTrack.kt\ncom/kubi/network/socket/track/ConnectTrack\n*L\n52#1:245\n57#1:246\n63#1:247\n71#1:248\n76#1:249\n83#1:250\n89#1:251\n94#1:252\n99#1:253\n105#1:254\n110#1:255\n115#1:256\n129#1:257,33\n140#1:290,33\n158#1:324,4\n171#1:328,12\n176#1:340,12\n*E\n"})
public final class C45292b implements p672ur.InterfaceC45295e {

    /* JADX INFO: renamed from: a */
    @org.jetbrains.annotations.NotNull
    public final java.lang.String f101832a;

    /* JADX INFO: renamed from: b */
    public long f101833b;

    /* JADX INFO: renamed from: c */
    public long f101834c;

    /* JADX INFO: renamed from: d */
    public long f101835d;

    /* JADX INFO: renamed from: e */
    public long f101836e;

    /* JADX INFO: renamed from: f */
    public long f101837f;

    /* JADX INFO: renamed from: g */
    public long f101838g;

    /* JADX INFO: renamed from: h */
    public long f101839h;

    /* JADX INFO: renamed from: i */
    public long f101840i;

    /* JADX INFO: renamed from: j */
    public long f101841j;

    /* JADX INFO: renamed from: k */
    @org.jetbrains.annotations.NotNull
    public java.lang.String f101842k;

    /* JADX INFO: renamed from: l */
    public volatile boolean f101843l;

    /* JADX INFO: renamed from: m */
    @org.jetbrains.annotations.NotNull
    public final java.lang.StringBuffer f101844m;

    /* JADX INFO: renamed from: n */
    @org.jetbrains.annotations.Nullable
    public java.lang.Throwable f101845n;

    /* JADX INFO: renamed from: o */
    @org.jetbrains.annotations.NotNull
    public final com.kubi.network.socket.utils.C19393i f101846o;

    public C45292b(@org.jetbrains.annotations.NotNull java.lang.String r3) {
            r2 = this;
            java.lang.String r0 = "linkType"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r2.<init>()
            r2.f101832a = r3
            java.lang.String r3 = ""
            r2.f101842k = r3
            r3 = 1
            r2.f101843l = r3
            java.lang.StringBuffer r3 = new java.lang.StringBuffer
            r3.<init>()
            r2.f101844m = r3
            com.kubi.network.socket.utils.i r3 = new com.kubi.network.socket.utils.i
            r0 = 10
            r3.<init>(r0)
            r2.f101846o = r3
            return
    }

    public /* synthetic */ C45292b(java.lang.String r1, int r2, kotlin.jvm.internal.DefaultConstructorMarker r3) {
            r0 = this;
            r2 = r2 & 1
            if (r2 == 0) goto L6
            java.lang.String r1 = "push"
        L6:
            r0.<init>(r1)
            return
    }

    /* JADX INFO: renamed from: m */
    public static final /* synthetic */ long m100109m(p672ur.C45292b r2) {
            long r0 = r2.f101835d
            return r0
    }

    /* JADX INFO: renamed from: n */
    public static final /* synthetic */ java.lang.String m100110n(p672ur.C45292b r0) {
            java.lang.String r0 = r0.f101832a
            return r0
    }

    /* JADX INFO: renamed from: t */
    public static final java.lang.String m100111t(int r2, java.lang.String r3, java.lang.String r4, p672ur.C45292b r5, long r6, long r8, long r10, long r12, java.lang.Throwable r14) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "code = "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r2 = ",host = "
            r0.append(r2)
            r0.append(r3)
            java.lang.String r2 = ",path = "
            r0.append(r2)
            r0.append(r4)
            java.lang.String r2 = ",networkType = "
            r0.append(r2)
            java.lang.String r2 = com.kubi.network.socket.utils.C19391g.m43056b()
            r0.append(r2)
            java.lang.String r2 = ",networkCarrier = "
            r0.append(r2)
            java.lang.String r2 = com.kubi.network.socket.utils.C19391g.m43057c()
            r0.append(r2)
            java.lang.String r2 = ",isProxy = "
            r0.append(r2)
            boolean r2 = com.kubi.network.socket.utils.C19391g.m43059l()
            r0.append(r2)
            java.lang.String r2 = ",isVPN = "
            r0.append(r2)
            boolean r2 = com.kubi.network.socket.utils.C19391g.m43060m()
            r0.append(r2)
            java.lang.String r2 = ",retryCount = "
            r0.append(r2)
            long r2 = r5.f101835d
            r0.append(r2)
            java.lang.String r2 = ",totalDuration = "
            r0.append(r2)
            r0.append(r6)
            java.lang.String r2 = ",flowDuration = "
            r0.append(r2)
            r0.append(r8)
            java.lang.String r2 = ",tokenDuration = "
            r0.append(r2)
            r0.append(r10)
            java.lang.String r2 = ",connectDuration = "
            r0.append(r2)
            r0.append(r12)
            java.lang.String r2 = ",callChain = "
            r0.append(r2)
            java.lang.StringBuffer r2 = r5.f101844m
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            if (r14 == 0) goto Laf
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            java.lang.String r2 = ", exception_type = "
            r3.append(r2)
            java.lang.Class r2 = r14.getClass()
            java.lang.String r2 = r2.getCanonicalName()
            r3.append(r2)
            java.lang.String r2 = ", exception_message = "
            r3.append(r2)
            java.lang.String r2 = r14.getMessage()
            r3.append(r2)
            java.lang.String r2 = r3.toString()
        Laf:
            return r2
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ void m100112u(p672ur.C45292b r1, java.lang.String r2, java.lang.Throwable r3, int r4, java.lang.Object r5) {
            r5 = r4 & 1
            r0 = 0
            if (r5 == 0) goto L6
            r2 = r0
        L6:
            r4 = r4 & 2
            if (r4 == 0) goto Lb
            r3 = r0
        Lb:
            r1.m100129s(r2, r3)
            return
    }

    @Override // p672ur.InterfaceC45295e
    /* JADX INFO: renamed from: a */
    public void mo100113a() {
            r9 = this;
            r9.m100126p()
            long r0 = r9.f101835d
            r2 = 1
            long r0 = r0 + r2
            r9.f101835d = r0
            long r0 = java.lang.System.currentTimeMillis()
            r9.f101836e = r0
            java.lang.StringBuffer r2 = r9.f101844m
            long r3 = r9.f101833b
            r7 = 4
            r8 = 0
            java.lang.String r5 = "flowStart"
            r6 = 0
            p672ur.C45296f.m100134b(r2, r3, r5, r6, r7, r8)
            return
    }

    @Override // p672ur.InterfaceC45295e
    /* JADX INFO: renamed from: b */
    public void mo100114b() {
            r7 = this;
            r7.m100125o()
            long r1 = java.lang.System.currentTimeMillis()
            r7.f101833b = r1
            java.lang.StringBuffer r0 = r7.f101844m
            r5 = 4
            r6 = 0
            java.lang.String r3 = "callStart"
            r4 = 0
            p672ur.C45296f.m100134b(r0, r1, r3, r4, r5, r6)
            return
    }

    @Override // p672ur.InterfaceC45295e
    /* JADX INFO: renamed from: c */
    public void mo100115c() {
            r5 = this;
            long r0 = java.lang.System.currentTimeMillis()
            r5.f101834c = r0
            java.lang.StringBuffer r0 = r5.f101844m
            long r1 = r5.f101833b
            java.lang.String r3 = "callEnd"
            r4 = 1
            p672ur.C45296f.m100133a(r0, r1, r3, r4)
            java.lang.String r0 = r5.f101842k
            r5.m100127q(r0)
            return
    }

    @Override // p672ur.InterfaceC45295e
    /* JADX INFO: renamed from: d */
    public void mo100116d() {
            r9 = this;
            long r0 = java.lang.System.currentTimeMillis()
            r9.f101838g = r0
            java.lang.StringBuffer r2 = r9.f101844m
            long r3 = r9.f101833b
            r7 = 4
            r8 = 0
            java.lang.String r5 = "tokenStart"
            r6 = 0
            p672ur.C45296f.m100134b(r2, r3, r5, r6, r7, r8)
            return
    }

    @Override // p672ur.InterfaceC45295e
    /* JADX INFO: renamed from: e */
    public void mo100117e(@org.jetbrains.annotations.NotNull java.lang.Throwable r10) {
            r9 = this;
            java.lang.String r0 = "e"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            long r0 = java.lang.System.currentTimeMillis()
            r9.f101841j = r0
            java.lang.StringBuffer r2 = r9.f101844m
            long r3 = r9.f101833b
            r7 = 4
            r8 = 0
            java.lang.String r5 = "connectFail"
            r6 = 0
            p672ur.C45296f.m100134b(r2, r3, r5, r6, r7, r8)
            return
    }

    @Override // p672ur.InterfaceC45295e
    /* JADX INFO: renamed from: f */
    public void mo100118f(@org.jetbrains.annotations.NotNull com.kubi.network.socket.model.TokenEntity r10) {
            r9 = this;
            java.lang.String r0 = "token"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            java.lang.String r10 = r10.getWsUrl()
            r9.f101842k = r10
            long r0 = java.lang.System.currentTimeMillis()
            r9.f101840i = r0
            java.lang.StringBuffer r2 = r9.f101844m
            long r3 = r9.f101833b
            r7 = 4
            r8 = 0
            java.lang.String r5 = "connectStart"
            r6 = 0
            p672ur.C45296f.m100134b(r2, r3, r5, r6, r7, r8)
            return
    }

    @Override // p672ur.InterfaceC45295e
    /* JADX INFO: renamed from: g */
    public void mo100119g() {
            r5 = this;
            long r0 = java.lang.System.currentTimeMillis()
            r5.f101834c = r0
            java.lang.StringBuffer r0 = r5.f101844m
            long r1 = r5.f101833b
            java.lang.String r3 = "callFail"
            r4 = 1
            p672ur.C45296f.m100133a(r0, r1, r3, r4)
            java.lang.Throwable r0 = r5.f101845n
            if (r0 != 0) goto L19
            com.kubi.network.socket.exception.ConnectUnknownException r0 = new com.kubi.network.socket.exception.ConnectUnknownException
            r0.<init>()
        L19:
            r5.m100128r(r0)
            return
    }

    @Override // p672ur.InterfaceC45295e
    /* JADX INFO: renamed from: h */
    public void mo100120h() {
            r9 = this;
            long r0 = java.lang.System.currentTimeMillis()
            r9.f101839h = r0
            java.lang.StringBuffer r2 = r9.f101844m
            long r3 = r9.f101833b
            r7 = 4
            r8 = 0
            java.lang.String r5 = "tokenEnd"
            r6 = 0
            p672ur.C45296f.m100134b(r2, r3, r5, r6, r7, r8)
            return
    }

    @Override // p672ur.InterfaceC45295e
    /* JADX INFO: renamed from: i */
    public void mo100121i() {
            r9 = this;
            long r0 = java.lang.System.currentTimeMillis()
            r9.f101841j = r0
            java.lang.StringBuffer r2 = r9.f101844m
            long r3 = r9.f101833b
            r7 = 4
            r8 = 0
            java.lang.String r5 = "connectEnd"
            r6 = 0
            p672ur.C45296f.m100134b(r2, r3, r5, r6, r7, r8)
            return
    }

    @Override // p672ur.InterfaceC45295e
    /* JADX INFO: renamed from: j */
    public void mo100122j(@org.jetbrains.annotations.NotNull java.lang.Throwable r10) {
            r9 = this;
            java.lang.String r0 = "e"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            long r0 = java.lang.System.currentTimeMillis()
            r9.f101839h = r0
            java.lang.StringBuffer r2 = r9.f101844m
            long r3 = r9.f101833b
            r7 = 4
            r8 = 0
            java.lang.String r5 = "tokenFail"
            r6 = 0
            p672ur.C45296f.m100134b(r2, r3, r5, r6, r7, r8)
            return
    }

    @Override // p672ur.InterfaceC45295e
    /* JADX INFO: renamed from: k */
    public void mo100123k() {
            r9 = this;
            long r0 = java.lang.System.currentTimeMillis()
            r9.f101837f = r0
            java.lang.StringBuffer r2 = r9.f101844m
            long r3 = r9.f101833b
            r7 = 4
            r8 = 0
            java.lang.String r5 = "flowEnd"
            r6 = 0
            p672ur.C45296f.m100134b(r2, r3, r5, r6, r7, r8)
            r9.m100130v()
            return
    }

    @Override // p672ur.InterfaceC45295e
    /* JADX INFO: renamed from: l */
    public void mo100124l(@org.jetbrains.annotations.NotNull java.lang.Throwable r10) {
            r9 = this;
            java.lang.String r0 = "e"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            r9.f101845n = r10
            long r0 = java.lang.System.currentTimeMillis()
            r9.f101837f = r0
            java.lang.StringBuffer r2 = r9.f101844m
            long r3 = r9.f101833b
            r7 = 4
            r8 = 0
            java.lang.String r5 = "flowFail"
            r6 = 0
            p672ur.C45296f.m100134b(r2, r3, r5, r6, r7, r8)
            r9.m100130v()
            return
    }

    /* JADX INFO: renamed from: o */
    public final void m100125o() {
            r2 = this;
            r0 = 0
            r2.f101833b = r0
            r2.f101834c = r0
            r2.f101835d = r0
            java.lang.StringBuffer r0 = r2.f101844m
            r1 = 0
            r0.setLength(r1)
            r0 = 1
            r2.f101843l = r0
            r2.m100126p()
            return
    }

    /* JADX INFO: renamed from: p */
    public final void m100126p() {
            r2 = this;
            r0 = 0
            r2.f101836e = r0
            r2.f101837f = r0
            r2.f101838g = r0
            r2.f101839h = r0
            r2.f101840i = r0
            r2.f101841j = r0
            java.lang.String r0 = ""
            r2.f101842k = r0
            r0 = 0
            r2.f101845n = r0
            return
    }

    /* JADX INFO: renamed from: q */
    public final void m100127q(java.lang.String r7) {
            r6 = this;
            r0 = 2
            r1 = 0
            m100112u(r6, r7, r1, r0, r1)     // Catch: java.lang.Throwable -> L6
            return
        L6:
            r7 = move-exception
            boolean r2 = r7 instanceof java.net.UnknownHostException
            r3 = 1
            if (r2 == 0) goto Le
            goto L8d
        Le:
            boolean r2 = r7 instanceof java.net.SocketException
            if (r2 == 0) goto L14
            goto L8d
        L14:
            boolean r2 = r7 instanceof java.net.SocketTimeoutException
            if (r2 == 0) goto L1a
            goto L8d
        L1a:
            boolean r2 = r7 instanceof javax.net.ssl.SSLException
            if (r2 == 0) goto L20
            goto L8d
        L20:
            boolean r2 = r7 instanceof javax.net.ssl.SSLProtocolException
            if (r2 == 0) goto L26
            goto L8d
        L26:
            boolean r2 = r7 instanceof javax.net.ssl.SSLPeerUnverifiedException
            if (r2 == 0) goto L2c
            goto L8d
        L2c:
            boolean r2 = r7 instanceof okhttp3.internal.http2.ConnectionShutdownException
            if (r2 == 0) goto L31
            goto L8d
        L31:
            boolean r2 = r7 instanceof java.lang.SecurityException
            r4 = 0
            if (r2 == 0) goto L45
            java.lang.String r2 = r7.getMessage()
            if (r2 == 0) goto L43
            java.lang.String r3 = "Package android does not belong to"
            boolean r3 = kotlin.text.StringsKt.startsWith$default(r2, r3, r4, r0, r1)
            goto L8d
        L43:
            r3 = r4
            goto L8d
        L45:
            boolean r2 = r7 instanceof java.io.IOException
            if (r2 == 0) goto L43
            java.lang.String r2 = r7.getMessage()
            if (r2 == 0) goto L43
            java.lang.String r5 = "Required SETTINGS preface not received"
            boolean r5 = kotlin.text.StringsKt.startsWith$default(r2, r5, r4, r0, r1)
            if (r5 == 0) goto L58
            goto L8d
        L58:
            java.lang.String r5 = "Unexpected response code for CONNECT"
            boolean r5 = kotlin.text.StringsKt.startsWith$default(r2, r5, r4, r0, r1)
            if (r5 == 0) goto L61
            goto L8d
        L61:
            java.lang.String r5 = "exhausted all routes"
            boolean r5 = kotlin.text.StringsKt.startsWith$default(r2, r5, r4, r0, r1)
            if (r5 == 0) goto L6a
            goto L8d
        L6a:
            java.lang.String r5 = "unexpected end of stream"
            boolean r5 = kotlin.text.StringsKt.startsWith$default(r2, r5, r4, r0, r1)
            if (r5 == 0) goto L73
            goto L8d
        L73:
            java.lang.String r5 = "stream was reset: CANCEL"
            boolean r5 = kotlin.text.StringsKt.startsWith$default(r2, r5, r4, r0, r1)
            if (r5 == 0) goto L7c
            goto L8d
        L7c:
            java.lang.String r5 = "Software caused connection abort"
            boolean r0 = kotlin.text.StringsKt.startsWith$default(r2, r5, r4, r0, r1)
            if (r0 == 0) goto L85
            goto L8d
        L85:
            java.lang.String r0 = "closed"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L43
        L8d:
            java.lang.String r0 = "NetworkChain:Ws"
            if (r3 == 0) goto L95
            ro.C44128b.m97263g(r0, r7)
            goto L98
        L95:
            p605rr.C44170a.m97379a(r7, r0)
        L98:
            return
    }

    /* JADX INFO: renamed from: r */
    public final void m100128r(java.lang.Throwable r7) {
            r6 = this;
            r0 = 0
            r1 = 1
            boolean r2 = r6.f101843l     // Catch: java.lang.Throwable -> L12
            if (r2 == 0) goto La4
            com.kubi.network.socket.utils.g r2 = com.kubi.network.socket.utils.C19391g.f36153a     // Catch: java.lang.Throwable -> L12
            boolean r2 = r2.m43062e()     // Catch: java.lang.Throwable -> L12
            if (r2 == 0) goto La4
            m100112u(r6, r0, r7, r1, r0)     // Catch: java.lang.Throwable -> L12
            return
        L12:
            r7 = move-exception
            boolean r2 = r7 instanceof java.net.UnknownHostException
            if (r2 == 0) goto L19
            goto L99
        L19:
            boolean r2 = r7 instanceof java.net.SocketException
            if (r2 == 0) goto L1f
            goto L99
        L1f:
            boolean r2 = r7 instanceof java.net.SocketTimeoutException
            if (r2 == 0) goto L25
            goto L99
        L25:
            boolean r2 = r7 instanceof javax.net.ssl.SSLException
            if (r2 == 0) goto L2b
            goto L99
        L2b:
            boolean r2 = r7 instanceof javax.net.ssl.SSLProtocolException
            if (r2 == 0) goto L31
            goto L99
        L31:
            boolean r2 = r7 instanceof javax.net.ssl.SSLPeerUnverifiedException
            if (r2 == 0) goto L37
            goto L99
        L37:
            boolean r2 = r7 instanceof okhttp3.internal.http2.ConnectionShutdownException
            if (r2 == 0) goto L3c
            goto L99
        L3c:
            boolean r2 = r7 instanceof java.lang.SecurityException
            r3 = 2
            r4 = 0
            if (r2 == 0) goto L51
            java.lang.String r1 = r7.getMessage()
            if (r1 == 0) goto L4f
            java.lang.String r2 = "Package android does not belong to"
            boolean r1 = kotlin.text.StringsKt.startsWith$default(r1, r2, r4, r3, r0)
            goto L99
        L4f:
            r1 = r4
            goto L99
        L51:
            boolean r2 = r7 instanceof java.io.IOException
            if (r2 == 0) goto L4f
            java.lang.String r2 = r7.getMessage()
            if (r2 == 0) goto L4f
            java.lang.String r5 = "Required SETTINGS preface not received"
            boolean r5 = kotlin.text.StringsKt.startsWith$default(r2, r5, r4, r3, r0)
            if (r5 == 0) goto L64
            goto L99
        L64:
            java.lang.String r5 = "Unexpected response code for CONNECT"
            boolean r5 = kotlin.text.StringsKt.startsWith$default(r2, r5, r4, r3, r0)
            if (r5 == 0) goto L6d
            goto L99
        L6d:
            java.lang.String r5 = "exhausted all routes"
            boolean r5 = kotlin.text.StringsKt.startsWith$default(r2, r5, r4, r3, r0)
            if (r5 == 0) goto L76
            goto L99
        L76:
            java.lang.String r5 = "unexpected end of stream"
            boolean r5 = kotlin.text.StringsKt.startsWith$default(r2, r5, r4, r3, r0)
            if (r5 == 0) goto L7f
            goto L99
        L7f:
            java.lang.String r5 = "stream was reset: CANCEL"
            boolean r5 = kotlin.text.StringsKt.startsWith$default(r2, r5, r4, r3, r0)
            if (r5 == 0) goto L88
            goto L99
        L88:
            java.lang.String r5 = "Software caused connection abort"
            boolean r0 = kotlin.text.StringsKt.startsWith$default(r2, r5, r4, r3, r0)
            if (r0 == 0) goto L91
            goto L99
        L91:
            java.lang.String r0 = "closed"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L4f
        L99:
            java.lang.String r0 = "NetworkChain:Ws"
            if (r1 == 0) goto La1
            ro.C44128b.m97263g(r0, r7)
            goto La4
        La1:
            p605rr.C44170a.m97379a(r7, r0)
        La4:
            return
    }

    /* JADX INFO: renamed from: s */
    public final void m100129s(java.lang.String r22, java.lang.Throwable r23) {
            r21 = this;
            r4 = r21
            r13 = r23
            r1 = 0
            if (r13 == 0) goto L1e
            boolean r0 = r13 instanceof com.kubi.network.socket.exception.NetworkException
            if (r0 == 0) goto Lf
            r0 = r13
            com.kubi.network.socket.exception.NetworkException r0 = (com.kubi.network.socket.exception.NetworkException) r0
            goto L10
        Lf:
            r0 = r1
        L10:
            if (r0 != 0) goto L17
            com.kubi.network.socket.exception.ConnectUnknownException r0 = new com.kubi.network.socket.exception.ConnectUnknownException
            r0.<init>()
        L17:
            int r0 = r0.getCode()
            r2 = r1
            r1 = r0
            goto L20
        L1e:
            r2 = r1
            r1 = 0
        L20:
            kotlin.Result$Companion r0 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> L2f
            android.net.Uri r0 = android.net.Uri.parse(r22)     // Catch: java.lang.Throwable -> L2f
            java.lang.String r0 = r0.getHost()     // Catch: java.lang.Throwable -> L2f
            java.lang.Object r0 = kotlin.Result.m103844constructorimpl(r0)     // Catch: java.lang.Throwable -> L2f
            goto L3a
        L2f:
            r0 = move-exception
            kotlin.Result$Companion r3 = kotlin.Result.Companion
            java.lang.Object r0 = kotlin.ResultKt.createFailure(r0)
            java.lang.Object r0 = kotlin.Result.m103844constructorimpl(r0)
        L3a:
            boolean r3 = kotlin.Result.m103850isFailureimpl(r0)
            if (r3 == 0) goto L41
            r0 = r2
        L41:
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r3 = "unknown"
            java.lang.String r5 = com.kubi.utils.extensions.C27041f.m66669i(r0, r3)
            android.net.Uri r0 = android.net.Uri.parse(r22)     // Catch: java.lang.Throwable -> L56
            java.lang.String r0 = r0.getPath()     // Catch: java.lang.Throwable -> L56
            java.lang.Object r0 = kotlin.Result.m103844constructorimpl(r0)     // Catch: java.lang.Throwable -> L56
            goto L61
        L56:
            r0 = move-exception
            kotlin.Result$Companion r6 = kotlin.Result.Companion
            java.lang.Object r0 = kotlin.ResultKt.createFailure(r0)
            java.lang.Object r0 = kotlin.Result.m103844constructorimpl(r0)
        L61:
            boolean r6 = kotlin.Result.m103850isFailureimpl(r0)
            if (r6 == 0) goto L68
            r0 = r2
        L68:
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r3 = com.kubi.utils.extensions.C27041f.m66669i(r0, r3)
            long r6 = r4.f101834c
            long r8 = r4.f101833b
            r10 = 15000(0x3a98, double:7.411E-320)
            long r6 = p672ur.C45296f.m100135c(r6, r8, r10)
            long r8 = r4.f101837f
            long r10 = r4.f101836e
            r19 = 15000(0x3a98, double:7.411E-320)
            r15 = r8
            r17 = r10
            long r8 = p672ur.C45296f.m100135c(r15, r17, r19)
            long r10 = r4.f101839h
            long r14 = r4.f101838g
            r17 = r14
            r15 = r10
            long r10 = p672ur.C45296f.m100135c(r15, r17, r19)
            long r14 = r4.f101841j
            r22 = r3
            long r2 = r4.f101840i
            r18 = 15000(0x3a98, double:7.411E-320)
            r16 = r2
            long r2 = p672ur.C45296f.m100135c(r14, r16, r18)
            com.kubi.monitor.TechnologyEvent r0 = com.kubi.monitor.TechnologyEvent.f35482a
            com.kubi.monitor.TechnologyEvent$EventParametersBuilder$Companion r0 = com.kubi.monitor.TechnologyEvent.EventParametersBuilder.f35483b
            com.kubi.monitor.TechnologyEvent$EventParametersBuilder r12 = r0.acquire()
            java.lang.String r14 = "code"
            r12.m42391b(r14, r1)
            java.lang.String r14 = "host"
            r12.m42393d(r14, r5)
            java.lang.String r14 = m100110n(r4)
            java.lang.String r15 = "link_type"
            r12.m42393d(r15, r14)
            com.kubi.monitor.TechnologyEvent.C19216a.m42397b(r12)
            java.lang.String r14 = "count"
            r17 = r0
            r16 = r1
            long r0 = m100109m(r4)
            r12.m42396g(r14, r0)
            java.lang.String r0 = "duration"
            r12.m42396g(r0, r6)
            java.lang.String r0 = "duration1"
            r12.m42396g(r0, r10)
            java.lang.String r0 = "duration2"
            r12.m42396g(r0, r2)
            java.lang.String r0 = "duration3"
            r12.m42396g(r0, r8)
            java.lang.String r0 = "socket_connect"
            com.kubi.monitor.TechnologyEvent.m42388d(r0, r12)
            com.kubi.sdk.constant.monitor.KunlunEventNameEnum r0 = com.kubi.sdk.constant.monitor.KunlunEventNameEnum.FRONTEND_CONNECT_WS_COUNT
            com.kubi.monitor.TechnologyEvent$EventParametersBuilder r1 = r17.acquire()
            java.lang.String r12 = "domain"
            r1.m42393d(r12, r5)
            java.lang.String r14 = "status_code"
            r4 = r16
            r1.m42391b(r14, r4)
            r16 = r0
            java.lang.String r0 = m100110n(r21)
            r1.m42393d(r15, r0)
            com.kubi.monitor.TechnologyEvent$a r0 = com.kubi.monitor.TechnologyEvent.C19216a.f35485a
            r17 = r8
            java.util.Map r8 = r0.m42399c(r1)
            java.util.Map r0 = r0.m42398a(r1)
            qq.i r1 = p569qq.C43848i.f96913a
            qq.e r1 = r1.m96586e()
            java.util.List r1 = r1.mo32841c()
            java.util.Iterator r1 = r1.iterator()
        L117:
            boolean r9 = r1.hasNext()
            if (r9 == 0) goto L13f
            java.lang.Object r9 = r1.next()
            rq.a r9 = (p604rq.InterfaceC44169a) r9
            boolean r19 = r0.isEmpty()
            if (r19 == 0) goto L135
            r19 = r1
            java.lang.String r1 = r16.getEventName()
            r9.mo94079b(r1, r8)
        L132:
            r1 = r19
            goto L117
        L135:
            r19 = r1
            java.lang.String r1 = r16.getEventName()
            r9.mo94078a(r1, r0, r8)
            goto L132
        L13f:
            com.kubi.sdk.constant.monitor.KunlunEventNameEnum r0 = com.kubi.sdk.constant.monitor.KunlunEventNameEnum.FRONTEND_CONNECT_WS_COST_MILLISECONDS
            com.kubi.monitor.TechnologyEvent$EventParametersBuilder$Companion r1 = com.kubi.monitor.TechnologyEvent.EventParametersBuilder.f35483b
            com.kubi.monitor.TechnologyEvent$EventParametersBuilder r1 = r1.acquire()
            r1.m42393d(r12, r5)
            r1.m42391b(r14, r4)
            java.lang.String r8 = m100110n(r21)
            r1.m42393d(r15, r8)
            java.lang.String r8 = "total"
            r1.m42396g(r8, r6)
            java.lang.String r8 = "token"
            r1.m42396g(r8, r10)
            java.lang.String r8 = "connect"
            r1.m42396g(r8, r2)
            com.kubi.monitor.TechnologyEvent$a r8 = com.kubi.monitor.TechnologyEvent.C19216a.f35485a
            java.util.Map r9 = r8.m42399c(r1)
            java.util.Map r1 = r8.m42398a(r1)
            qq.i r8 = p569qq.C43848i.f96913a
            qq.e r8 = r8.m96586e()
            java.util.List r8 = r8.mo32841c()
            java.util.Iterator r8 = r8.iterator()
        L17b:
            boolean r12 = r8.hasNext()
            if (r12 == 0) goto L19d
            java.lang.Object r12 = r8.next()
            rq.a r12 = (p604rq.InterfaceC44169a) r12
            boolean r14 = r1.isEmpty()
            if (r14 == 0) goto L195
            java.lang.String r14 = r0.getEventName()
            r12.mo94079b(r14, r9)
            goto L17b
        L195:
            java.lang.String r14 = r0.getEventName()
            r12.mo94078a(r14, r1, r9)
            goto L17b
        L19d:
            r0 = 1
            java.lang.String r14 = "NetworkChain:Ws"
            if (r4 <= 0) goto L1c7
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            java.lang.String r1 = "request ws_connect_error: "
            r15.append(r1)
            r1 = r4
            r9 = r10
            r4 = r21
            r11 = r2
            r2 = r5
            r5 = r6
            r7 = r17
            r3 = r22
            java.lang.String r2 = m100111t(r1, r2, r3, r4, r5, r7, r9, r11, r13)
            r15.append(r2)
            java.lang.String r2 = r15.toString()
            ro.C44128b.m97261e(r14, r2)
            goto L234
        L1c7:
            r1 = r4
            r9 = r10
            r11 = r2
            r2 = r5
            r5 = r6
            r7 = r17
            r3 = r22
            r15 = 5000(0x1388, double:2.4703E-320)
            int r4 = (r7 > r15 ? 1 : (r7 == r15 ? 0 : -1))
            if (r4 <= 0) goto L1f3
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            java.lang.String r4 = "request ws_connect_slow: "
            r15.append(r4)
            r4 = r21
            r13 = r23
            java.lang.String r2 = m100111t(r1, r2, r3, r4, r5, r7, r9, r11, r13)
            r15.append(r2)
            java.lang.String r2 = r15.toString()
            ro.C44128b.m97261e(r14, r2)
            goto L234
        L1f3:
            kotlin.random.Random$Default r4 = kotlin.random.Random.Default
            r13 = 100
            int r4 = r4.nextInt(r13)
            java.lang.String r13 = "request ws_connect_success: "
            if (r4 != r0) goto L21a
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            r15.append(r13)
            r4 = r21
            r13 = r23
            java.lang.String r2 = m100111t(r1, r2, r3, r4, r5, r7, r9, r11, r13)
            r15.append(r2)
            java.lang.String r2 = r15.toString()
            ro.C44128b.m97261e(r14, r2)
            goto L234
        L21a:
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            r15.append(r13)
            r4 = r21
            r13 = r23
            java.lang.String r2 = m100111t(r1, r2, r3, r4, r5, r7, r9, r11, r13)
            r15.append(r2)
            java.lang.String r2 = r15.toString()
            ro.C44128b.m97266j(r14, r2)
        L234:
            com.kubi.network.socket.utils.i r2 = r4.f101846o
            if (r1 != 0) goto L239
            goto L23a
        L239:
            r0 = 0
        L23a:
            com.kubi.network.socket.utils.j r0 = r2.m43070a(r0)
            if (r0 == 0) goto L264
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "request ws_connect_success_rate: windowSuccessRate = "
            r1.append(r2)
            double r2 = r0.m43073b()
            r1.append(r2)
            java.lang.String r2 = ", totalSuccessRate = "
            r1.append(r2)
            double r2 = r0.m43072a()
            r1.append(r2)
            java.lang.String r0 = r1.toString()
            ro.C44128b.m97261e(r14, r0)
        L264:
            return
    }

    /* JADX INFO: renamed from: v */
    public final void m100130v() {
            r1 = this;
            boolean r0 = r1.f101843l
            if (r0 == 0) goto Lc
            com.kubi.network.socket.utils.d r0 = com.kubi.network.socket.utils.C19388d.f36150a
            boolean r0 = r0.m43053b()
            r1.f101843l = r0
        Lc:
            return
    }
}
