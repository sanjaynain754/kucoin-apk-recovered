package ai.advance.sdk.global.iqa.lib;

import ai.advance.sdk.global.iqa.lib.enums.CardSide;
import ai.advance.sdk.global.iqa.lib.enums.CardType;
import ai.advance.sdk.global.iqa.lib.enums.Mode;
import androidx.annotation.NonNull;
import java.io.Serializable;

/* JADX INFO: loaded from: classes23.dex */
public class IQAExtras implements Serializable {

    /* JADX INFO: renamed from: a */
    private CardSide f991a;

    /* JADX INFO: renamed from: b */
    private int f992b;

    /* JADX INFO: renamed from: c */
    private String f993c;

    /* JADX INFO: renamed from: d */
    private CardType f994d;

    /* JADX INFO: renamed from: e */
    private Mode f995e;

    /* JADX INFO: renamed from: f */
    private boolean f996f;

    /* JADX INFO: renamed from: g */
    private boolean f997g;

    /* JADX INFO: renamed from: ai.advance.sdk.global.iqa.lib.IQAExtras$a */
    public static class C0352a {

        /* JADX INFO: renamed from: a */
        public IQAExtras f998a;

        /* JADX INFO: renamed from: a */
        public IQAExtras m1351a() {
            return this.f998a;
        }

        /* JADX INFO: renamed from: b */
        public C0352a m1352b(boolean z11) {
            this.f998a.f997g = z11;
            return this;
        }

        /* JADX INFO: renamed from: c */
        public C0352a m1353c(boolean z11) {
            this.f998a.f996f = z11;
            return this;
        }

        public C0352a(@NonNull String str, @NonNull CardType cardType, @NonNull CardSide cardSide) {
            IQAExtras iQAExtras = new IQAExtras();
            this.f998a = iQAExtras;
            iQAExtras.f993c = str;
            this.f998a.f994d = cardType;
            this.f998a.f991a = cardSide;
        }
    }

    private IQAExtras() {
    }

    public CardSide getCardSide() {
        return this.f991a;
    }

    public CardType getCardType() {
        return this.f994d;
    }

    public int getMaxRetryTimes() {
        int i11 = this.f992b;
        if (i11 == 0) {
            return 1;
        }
        return i11;
    }

    public Mode getMode() {
        Mode mode = this.f995e;
        return mode == null ? Mode.DEFAULT : mode;
    }

    public String getRegion() {
        return this.f993c;
    }

    public boolean isReturnEmpty() {
        return this.f997g;
    }

    public boolean isSoundPlayEnable() {
        return this.f996f;
    }
}
