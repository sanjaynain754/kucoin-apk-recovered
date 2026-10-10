package ih0;

/* JADX INFO: renamed from: ih0.a */
/* JADX INFO: compiled from: Block.java */
/* JADX INFO: loaded from: classes61.dex */
public abstract class AbstractC38619a extends AbstractC38637s {
    @Override // ih0.AbstractC38637s
    /* JADX INFO: renamed from: j */
    public void mo87321j(AbstractC38637s abstractC38637s) {
        if (!(abstractC38637s instanceof AbstractC38619a)) {
            throw new IllegalArgumentException("Parent of block must also be block (can not be inline)");
        }
        super.mo87321j(abstractC38637s);
    }

    @Override // ih0.AbstractC38637s
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public AbstractC38619a mo87320f() {
        return (AbstractC38619a) super.mo87320f();
    }
}
