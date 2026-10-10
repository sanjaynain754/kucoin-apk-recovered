package p435ln;

import androidx.annotation.NonNull;
import com.kubi.kyc.api.KycInfoEntity;
import com.kubi.kyc.multitype.StepsCellViewBinder;
import me.drakeet.multitype.C42518a;
import me.drakeet.multitype.Items;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: ln.w */
/* JADX INFO: compiled from: KycAdapter.java */
/* JADX INFO: loaded from: classes21.dex */
public class C42274w extends C42518a {

    /* JADX INFO: renamed from: k */
    public a f93757k;

    /* JADX INFO: renamed from: l */
    public Items f93758l = new Items();

    /* JADX INFO: renamed from: ln.w$a */
    /* JADX INFO: compiled from: KycAdapter.java */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo37006a();

        /* JADX INFO: renamed from: b */
        void mo37007b();

        /* JADX INFO: renamed from: c */
        void mo37008c();
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ Unit m92778l(C42274w c42274w) {
        a aVar = c42274w.f93757k;
        if (aVar == null) {
            return null;
        }
        aVar.mo37008c();
        return null;
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ Unit m92779m(C42274w c42274w) {
        a aVar = c42274w.f93757k;
        if (aVar == null) {
            return null;
        }
        aVar.mo37007b();
        return null;
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ Unit m92780n(C42274w c42274w) {
        a aVar = c42274w.f93757k;
        if (aVar == null) {
            return null;
        }
        aVar.mo37006a();
        return null;
    }

    @NonNull
    /* JADX INFO: renamed from: o */
    public Items m92781o() {
        return this.f93758l;
    }

    public void setOnClickListener(a aVar) {
        this.f93757k = aVar;
    }

    public C42274w() {
        m93239j(C42267p.class, new C42270s());
        m93239j(C42254h.class, new C42260k());
        m93239j(C42259j0.class, new C42263l0());
        m93239j(InfoCell.class, new C42266o());
        m93239j(C42242b.class, new C42252g());
        m93239j(C42262l.class, new C42264m());
        m93239j(C42243b0.class, new StepsCellViewBinder());
        C42253g0 c42253g0 = new C42253g0();
        c42253g0.m92705o(new Function0() { // from class: ln.t
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C42274w.m92779m(this.f93754b);
            }
        });
        c42253g0.m92706p(new Function0() { // from class: ln.u
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C42274w.m92780n(this.f93755b);
            }
        });
        m93239j(C42247d0.class, c42253g0);
        C42276y c42276y = new C42276y();
        c42276y.m92787n(new Function0() { // from class: ln.v
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C42274w.m92778l(this.f93756b);
            }
        });
        m93239j(KycInfoEntity.class, c42276y);
        m93239j(LabelCell.class, new C42241a0());
        m93239j(TipCell.class, new C42257i0());
        setItems(this.f93758l);
    }
}
