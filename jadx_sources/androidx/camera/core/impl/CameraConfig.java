package androidx.camera.core.impl;

import cn.jiguang.privates.analysis.constants.JAnalysisConstants;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
public interface CameraConfig extends ReadableConfig {
    public static final int REQUIRED_RULE_COEXISTING_PREVIEW_AND_IMAGE_CAPTURE = 1;
    public static final int REQUIRED_RULE_NONE = 0;
    public static final Config.Option<UseCaseConfigFactory> OPTION_USECASE_CONFIG_FACTORY = Config.Option.create("camerax.core.camera.useCaseConfigFactory", UseCaseConfigFactory.class);
    public static final Config.Option<Identifier> OPTION_COMPATIBILITY_ID = Config.Option.create("camerax.core.camera.compatibilityId", Identifier.class);
    public static final Config.Option<Integer> OPTION_USE_CASE_COMBINATION_REQUIRED_RULE = Config.Option.create("camerax.core.camera.useCaseCombinationRequiredRule", Integer.class);
    public static final Config.Option<SessionProcessor> OPTION_SESSION_PROCESSOR = Config.Option.create("camerax.core.camera.SessionProcessor", SessionProcessor.class);
    public static final Config.Option<Boolean> OPTION_ZSL_DISABLED = Config.Option.create("camerax.core.camera.isZslDisabled", Boolean.class);
    public static final Config.Option<Boolean> OPTION_POSTVIEW_SUPPORTED = Config.Option.create("camerax.core.camera.isPostviewSupported", Boolean.class);
    public static final Config.Option<PostviewFormatSelector> OPTION_POSTVIEW_FORMAT_SELECTOR = Config.Option.create("camerax.core.camera.PostviewFormatSelector", PostviewFormatSelector.class);
    public static final Config.Option<Boolean> OPTION_CAPTURE_PROCESS_PROGRESS_SUPPORTED = Config.Option.create("camerax.core.camera.isCaptureProcessProgressSupported", Boolean.class);
    public static final PostviewFormatSelector DEFAULT_POSTVIEW_FORMAT_SELECTOR = new PostviewFormatSelector() { // from class: androidx.camera.core.impl.c
        @Override // androidx.camera.core.impl.CameraConfig.PostviewFormatSelector
        public final int select(int i11, List list) {
            return CameraConfig.m1936a(i11, list);
        }
    };

    public interface Builder<B> {
        B setCaptureProcessProgressSupported(boolean z11);

        B setCompatibilityId(Identifier identifier);

        B setPostviewFormatSelector(PostviewFormatSelector postviewFormatSelector);

        B setPostviewSupported(boolean z11);

        B setSessionProcessor(SessionProcessor sessionProcessor);

        B setUseCaseCombinationRequiredRule(int i11);

        B setUseCaseConfigFactory(UseCaseConfigFactory useCaseConfigFactory);

        B setZslDisabled(boolean z11);
    }

    public interface PostviewFormatSelector {
        int select(int i11, List<Integer> list);
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface RequiredRule {
    }

    Identifier getCompatibilityId();

    default SessionProcessor getSessionProcessor(SessionProcessor sessionProcessor) {
        return (SessionProcessor) retrieveOption(OPTION_SESSION_PROCESSOR, sessionProcessor);
    }

    /* JADX INFO: renamed from: a */
    static /* synthetic */ int m1936a(int i11, List list) {
        if (list.contains(35)) {
            return 35;
        }
        if (list.contains(256)) {
            return 256;
        }
        if (list.contains(Integer.valueOf(JAnalysisConstants.MainWhat.SET_STATIC_PROPERTY))) {
            return JAnalysisConstants.MainWhat.SET_STATIC_PROPERTY;
        }
        return 0;
    }

    default PostviewFormatSelector getPostviewFormatSelector() {
        return (PostviewFormatSelector) retrieveOption(OPTION_POSTVIEW_FORMAT_SELECTOR, DEFAULT_POSTVIEW_FORMAT_SELECTOR);
    }

    default SessionProcessor getSessionProcessor() {
        return (SessionProcessor) retrieveOption(OPTION_SESSION_PROCESSOR);
    }

    default int getUseCaseCombinationRequiredRule() {
        return ((Integer) retrieveOption(OPTION_USE_CASE_COMBINATION_REQUIRED_RULE, 0)).intValue();
    }

    default UseCaseConfigFactory getUseCaseConfigFactory() {
        return (UseCaseConfigFactory) retrieveOption(OPTION_USECASE_CONFIG_FACTORY, UseCaseConfigFactory.EMPTY_INSTANCE);
    }

    default boolean isCaptureProcessProgressSupported() {
        return ((Boolean) retrieveOption(OPTION_CAPTURE_PROCESS_PROGRESS_SUPPORTED, Boolean.FALSE)).booleanValue();
    }

    default boolean isPostviewSupported() {
        return ((Boolean) retrieveOption(OPTION_POSTVIEW_SUPPORTED, Boolean.FALSE)).booleanValue();
    }
}
