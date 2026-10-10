package androidx.window.embedding;

import android.content.Context;
import androidx.annotation.XmlRes;
import java.io.IOException;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.xmlpull.v1.XmlPullParserException;
import p852kotlin.Metadata;
import p852kotlin.collections.SetsKt;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: RuleController.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0005\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u0006\u0010\t\u001a\u00020\u0006J\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u000bJ\u000e\u0010\f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u0014\u0010\r\u001a\u00020\u00062\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m90084d2 = {"Landroidx/window/embedding/RuleController;", "", "embeddingBackend", "Landroidx/window/embedding/EmbeddingBackend;", "(Landroidx/window/embedding/EmbeddingBackend;)V", "addRule", "", "rule", "Landroidx/window/embedding/EmbeddingRule;", "clearRules", "getRules", "", "removeRule", "setRules", "rules", "Companion", "window_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class RuleController {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final EmbeddingBackend embeddingBackend;

    /* JADX INFO: compiled from: RuleController.kt */
    @Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\n\u001a\u00020\u000bH\u0007¨\u0006\f"}, m90084d2 = {"Landroidx/window/embedding/RuleController$Companion;", "", "()V", "getInstance", "Landroidx/window/embedding/RuleController;", "context", "Landroid/content/Context;", "parseRules", "", "Landroidx/window/embedding/EmbeddingRule;", "staticRuleResourceId", "", "window_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        @NotNull
        public final RuleController getInstance(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            Context applicationContext = context.getApplicationContext();
            EmbeddingBackend.Companion companion = EmbeddingBackend.INSTANCE;
            Intrinsics.checkNotNullExpressionValue(applicationContext, "applicationContext");
            return new RuleController(companion.getInstance(applicationContext));
        }

        @JvmStatic
        @NotNull
        public final Set<EmbeddingRule> parseRules(@NotNull Context context, @XmlRes int staticRuleResourceId) throws XmlPullParserException, IOException {
            Intrinsics.checkNotNullParameter(context, "context");
            RuleParser ruleParser = RuleParser.INSTANCE;
            Context applicationContext = context.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "context.applicationContext");
            Set<EmbeddingRule> rules$window_release = ruleParser.parseRules$window_release(applicationContext, staticRuleResourceId);
            return rules$window_release == null ? SetsKt.emptySet() : rules$window_release;
        }
    }

    public RuleController(@NotNull EmbeddingBackend embeddingBackend) {
        Intrinsics.checkNotNullParameter(embeddingBackend, "embeddingBackend");
        this.embeddingBackend = embeddingBackend;
    }

    @JvmStatic
    @NotNull
    public static final RuleController getInstance(@NotNull Context context) {
        return INSTANCE.getInstance(context);
    }

    @JvmStatic
    @NotNull
    public static final Set<EmbeddingRule> parseRules(@NotNull Context context, @XmlRes int i11) {
        return INSTANCE.parseRules(context, i11);
    }

    public final void clearRules() {
        this.embeddingBackend.setRules(SetsKt.emptySet());
    }

    @NotNull
    public final Set<EmbeddingRule> getRules() {
        return this.embeddingBackend.getRules();
    }

    public final void addRule(@NotNull EmbeddingRule rule) {
        Intrinsics.checkNotNullParameter(rule, "rule");
        this.embeddingBackend.addRule(rule);
    }

    public final void removeRule(@NotNull EmbeddingRule rule) {
        Intrinsics.checkNotNullParameter(rule, "rule");
        this.embeddingBackend.removeRule(rule);
    }

    public final void setRules(@NotNull Set<? extends EmbeddingRule> rules) {
        Intrinsics.checkNotNullParameter(rules, "rules");
        this.embeddingBackend.setRules(rules);
    }
}
