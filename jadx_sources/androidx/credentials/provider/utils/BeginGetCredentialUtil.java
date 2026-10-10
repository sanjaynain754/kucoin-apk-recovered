package androidx.credentials.provider.utils;

import android.annotation.SuppressLint;
import android.app.slice.Slice;
import android.content.pm.SigningInfo;
import android.os.Bundle;
import android.service.credentials.Action;
import android.service.credentials.BeginGetCredentialOption;
import android.service.credentials.BeginGetCredentialRequest;
import android.service.credentials.BeginGetCredentialResponse;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.credentials.provider.AuthenticationAction;
import androidx.credentials.provider.CallingAppInfo;
import androidx.credentials.provider.CredentialEntry;
import androidx.credentials.provider.RemoteEntry;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: BeginGetCredentialUtil.kt */
/* JADX INFO: loaded from: classes34.dex */
@RequiresApi(34)
@Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, m90084d2 = {"Landroidx/credentials/provider/utils/BeginGetCredentialUtil;", "", "<init>", "()V", "Companion", "credentials"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class BeginGetCredentialUtil {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: compiled from: BeginGetCredentialUtil.kt */
    @Metadata(m90083d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0001¢\u0006\u0002\b\bJ\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u001a\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0003J\u001e\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\u0002J\u001e\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u00102\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0015H\u0002J\u001e\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u00102\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0015H\u0002J\u000e\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005J\u0010\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u0002J\u000e\u0010#\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¨\u0006$"}, m90084d2 = {"Landroidx/credentials/provider/utils/BeginGetCredentialUtil$Companion;", "", "<init>", "()V", "convertToJetpackRequest", "Landroidx/credentials/provider/BeginGetCredentialRequest;", "request", "Landroid/service/credentials/BeginGetCredentialRequest;", "convertToJetpackRequest$credentials", "convertToFrameworkResponse", "Landroid/service/credentials/BeginGetCredentialResponse;", "response", "Landroidx/credentials/provider/BeginGetCredentialResponse;", "populateRemoteEntry", "", "frameworkBuilder", "Landroid/service/credentials/BeginGetCredentialResponse$Builder;", "remoteEntry", "Landroidx/credentials/provider/RemoteEntry;", "populateAuthenticationEntries", "authenticationActions", "", "Landroidx/credentials/provider/AuthenticationAction;", "populateActionEntries", "builder", "actionEntries", "Landroidx/credentials/provider/Action;", "populateCredentialEntries", "credentialEntries", "Landroidx/credentials/provider/CredentialEntry;", "convertToFrameworkRequest", "convertToJetpackBeginOption", "Landroid/service/credentials/BeginGetCredentialOption;", TUIConstants.TUIPollPlugin.PLUGIN_POLL_OPTION_CONTENT, "Landroidx/credentials/provider/BeginGetCredentialOption;", "convertToJetpackResponse", "credentials"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nBeginGetCredentialUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BeginGetCredentialUtil.kt\nandroidx/credentials/provider/utils/BeginGetCredentialUtil$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,186:1\n1869#2,2:187\n1869#2,2:189\n1869#2,2:191\n1869#2,2:193\n1#3:195\n*S KotlinDebug\n*F\n+ 1 BeginGetCredentialUtil.kt\nandroidx/credentials/provider/utils/BeginGetCredentialUtil$Companion\n*L\n42#1:187,2\n85#1:189,2\n96#1:191,2\n105#1:193,2\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BeginGetCredentialOption convertToFrameworkRequest$lambda$0(androidx.credentials.provider.BeginGetCredentialOption beginGetCredentialOption) {
            Companion companion = BeginGetCredentialUtil.INSTANCE;
            Intrinsics.checkNotNull(beginGetCredentialOption);
            return companion.convertToJetpackBeginOption(beginGetCredentialOption);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final CredentialEntry convertToJetpackResponse$lambda$0(android.service.credentials.CredentialEntry credentialEntry) {
            CredentialEntry.Companion companion = CredentialEntry.INSTANCE;
            Slice slice = credentialEntry.getSlice();
            Intrinsics.checkNotNullExpressionValue(slice, "getSlice(...)");
            return companion.fromSlice$credentials(slice);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final AuthenticationAction convertToJetpackResponse$lambda$12(Action action) {
            AuthenticationAction.Companion companion = AuthenticationAction.INSTANCE;
            Slice slice = action.getSlice();
            Intrinsics.checkNotNullExpressionValue(slice, "getSlice(...)");
            return companion.fromSlice(slice);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean convertToJetpackResponse$lambda$14(AuthenticationAction authenticationAction) {
            return authenticationAction != null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean convertToJetpackResponse$lambda$2(CredentialEntry credentialEntry) {
            return credentialEntry != null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final androidx.credentials.provider.Action convertToJetpackResponse$lambda$6(Action action) {
            androidx.credentials.provider.Action.Companion companion = androidx.credentials.provider.Action.INSTANCE;
            Slice slice = action.getSlice();
            Intrinsics.checkNotNullExpressionValue(slice, "getSlice(...)");
            return companion.fromSlice(slice);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean convertToJetpackResponse$lambda$8(androidx.credentials.provider.Action action) {
            return action != null;
        }

        @SuppressLint({"MissingPermission"})
        private final void populateRemoteEntry(BeginGetCredentialResponse.Builder frameworkBuilder, RemoteEntry remoteEntry) {
            if (remoteEntry == null) {
                return;
            }
            C2214f.m2738a();
            frameworkBuilder.setRemoteCredentialEntry(C2211e.m2736a(RemoteEntry.INSTANCE.toSlice(remoteEntry)));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BeginGetCredentialOption convertToFrameworkRequest$lambda$1(Function1 function1, Object obj) {
            return C2274z0.m2775a(function1.invoke(obj));
        }

        private final BeginGetCredentialOption convertToJetpackBeginOption(androidx.credentials.provider.BeginGetCredentialOption option) {
            C2254s0.m2765a();
            return C2245p0.m2759a(option.getId(), option.getType(), option.getCandidateQueryData());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final CredentialEntry convertToJetpackResponse$lambda$1(Function1 function1, Object obj) {
            return (CredentialEntry) function1.invoke(obj);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final androidx.credentials.provider.Action convertToJetpackResponse$lambda$10(androidx.credentials.provider.Action action) {
            Intrinsics.checkNotNull(action);
            return action;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final androidx.credentials.provider.Action convertToJetpackResponse$lambda$11(Function1 function1, Object obj) {
            return (androidx.credentials.provider.Action) function1.invoke(obj);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final AuthenticationAction convertToJetpackResponse$lambda$13(Function1 function1, Object obj) {
            return (AuthenticationAction) function1.invoke(obj);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean convertToJetpackResponse$lambda$15(Function1 function1, Object obj) {
            return ((Boolean) function1.invoke(obj)).booleanValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final AuthenticationAction convertToJetpackResponse$lambda$16(AuthenticationAction authenticationAction) {
            Intrinsics.checkNotNull(authenticationAction);
            return authenticationAction;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final AuthenticationAction convertToJetpackResponse$lambda$17(Function1 function1, Object obj) {
            return (AuthenticationAction) function1.invoke(obj);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean convertToJetpackResponse$lambda$3(Function1 function1, Object obj) {
            return ((Boolean) function1.invoke(obj)).booleanValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final CredentialEntry convertToJetpackResponse$lambda$4(CredentialEntry credentialEntry) {
            Intrinsics.checkNotNull(credentialEntry);
            return credentialEntry;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final CredentialEntry convertToJetpackResponse$lambda$5(Function1 function1, Object obj) {
            return (CredentialEntry) function1.invoke(obj);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final androidx.credentials.provider.Action convertToJetpackResponse$lambda$7(Function1 function1, Object obj) {
            return (androidx.credentials.provider.Action) function1.invoke(obj);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean convertToJetpackResponse$lambda$9(Function1 function1, Object obj) {
            return ((Boolean) function1.invoke(obj)).booleanValue();
        }

        private final void populateActionEntries(BeginGetCredentialResponse.Builder builder, List<androidx.credentials.provider.Action> actionEntries) {
            for (androidx.credentials.provider.Action action : actionEntries) {
                C2242o0.m2757a();
                builder.addAction(C2239n0.m2755a(androidx.credentials.provider.Action.INSTANCE.toSlice(action)));
            }
        }

        private final void populateAuthenticationEntries(BeginGetCredentialResponse.Builder frameworkBuilder, List<AuthenticationAction> authenticationActions) {
            for (AuthenticationAction authenticationAction : authenticationActions) {
                C2242o0.m2757a();
                frameworkBuilder.addAuthenticationAction(C2239n0.m2755a(AuthenticationAction.INSTANCE.toSlice(authenticationAction)));
            }
        }

        private final void populateCredentialEntries(BeginGetCredentialResponse.Builder builder, List<? extends CredentialEntry> credentialEntries) {
            for (CredentialEntry credentialEntry : credentialEntries) {
                Slice slice$credentials = CredentialEntry.INSTANCE.toSlice$credentials(credentialEntry);
                if (slice$credentials != null) {
                    C2251r0.m2763a();
                    C2254s0.m2765a();
                    builder.addCredentialEntry(C2248q0.m2761a(C2245p0.m2759a(credentialEntry.getBeginGetCredentialOption().getId(), credentialEntry.getType(), Bundle.EMPTY), slice$credentials));
                }
            }
        }

        @NotNull
        public final BeginGetCredentialRequest convertToFrameworkRequest(@NotNull androidx.credentials.provider.BeginGetCredentialRequest request) {
            Intrinsics.checkNotNullParameter(request, "request");
            BeginGetCredentialRequest.Builder builderM2769a = C2260u0.m2769a();
            if (request.getCallingAppInfo() != null) {
                C2223i.m2744a();
                builderM2769a.setCallingAppInfo(C2217g.m2740a(request.getCallingAppInfo().getPackageName(), request.getCallingAppInfo().getSigningInfo(), request.getCallingAppInfo().getOrigin()));
            }
            Stream<androidx.credentials.provider.BeginGetCredentialOption> stream = request.getBeginGetCredentialOptions().stream();
            final Function1 function1 = new Function1() { // from class: androidx.credentials.provider.utils.v1
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return BeginGetCredentialUtil.Companion.convertToFrameworkRequest$lambda$0((androidx.credentials.provider.BeginGetCredentialOption) obj);
                }
            };
            BeginGetCredentialRequest beginGetCredentialRequestBuild = builderM2769a.setBeginGetCredentialOptions((List) stream.map(new Function() { // from class: androidx.credentials.provider.utils.w1
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return BeginGetCredentialUtil.Companion.convertToFrameworkRequest$lambda$1(function1, obj);
                }
            }).collect(Collectors.toList())).build();
            Intrinsics.checkNotNullExpressionValue(beginGetCredentialRequestBuild, "build(...)");
            return beginGetCredentialRequestBuild;
        }

        @NotNull
        public final BeginGetCredentialResponse convertToFrameworkResponse(@NotNull androidx.credentials.provider.BeginGetCredentialResponse response) {
            Intrinsics.checkNotNullParameter(response, "response");
            BeginGetCredentialResponse.Builder builderM2767a = C2257t0.m2767a();
            populateCredentialEntries(builderM2767a, response.getCredentialEntries());
            populateActionEntries(builderM2767a, response.getActions());
            populateAuthenticationEntries(builderM2767a, response.getAuthenticationActions());
            populateRemoteEntry(builderM2767a, response.getRemoteEntry());
            BeginGetCredentialResponse beginGetCredentialResponseBuild = builderM2767a.build();
            Intrinsics.checkNotNullExpressionValue(beginGetCredentialResponseBuild, "build(...)");
            return beginGetCredentialResponseBuild;
        }

        @JvmStatic
        @NotNull
        public final androidx.credentials.provider.BeginGetCredentialRequest convertToJetpackRequest$credentials(@NotNull BeginGetCredentialRequest request) {
            CallingAppInfo callingAppInfoCreate;
            Intrinsics.checkNotNullParameter(request, "request");
            ArrayList arrayList = new ArrayList();
            List beginGetCredentialOptions = request.getBeginGetCredentialOptions();
            Intrinsics.checkNotNullExpressionValue(beginGetCredentialOptions, "getBeginGetCredentialOptions(...)");
            Iterator it = beginGetCredentialOptions.iterator();
            while (it.hasNext()) {
                BeginGetCredentialOption beginGetCredentialOptionM2775a = C2274z0.m2775a(it.next());
                androidx.credentials.provider.BeginGetCredentialOption.Companion companion = androidx.credentials.provider.BeginGetCredentialOption.INSTANCE;
                String id2 = beginGetCredentialOptionM2775a.getId();
                Intrinsics.checkNotNullExpressionValue(id2, "getId(...)");
                String type = beginGetCredentialOptionM2775a.getType();
                Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
                Bundle candidateQueryData = beginGetCredentialOptionM2775a.getCandidateQueryData();
                Intrinsics.checkNotNullExpressionValue(candidateQueryData, "getCandidateQueryData(...)");
                arrayList.add(companion.createFrom$credentials(id2, type, candidateQueryData));
            }
            android.service.credentials.CallingAppInfo callingAppInfo = request.getCallingAppInfo();
            if (callingAppInfo != null) {
                CallingAppInfo.Companion companion2 = CallingAppInfo.INSTANCE;
                String packageName = callingAppInfo.getPackageName();
                Intrinsics.checkNotNullExpressionValue(packageName, "getPackageName(...)");
                SigningInfo signingInfo = callingAppInfo.getSigningInfo();
                Intrinsics.checkNotNullExpressionValue(signingInfo, "getSigningInfo(...)");
                callingAppInfoCreate = companion2.create(packageName, signingInfo, callingAppInfo.getOrigin());
            } else {
                callingAppInfoCreate = null;
            }
            return new androidx.credentials.provider.BeginGetCredentialRequest(arrayList, callingAppInfoCreate);
        }

        @NotNull
        public final androidx.credentials.provider.BeginGetCredentialResponse convertToJetpackResponse(@NotNull BeginGetCredentialResponse response) {
            RemoteEntry remoteEntryFromSlice;
            Intrinsics.checkNotNullParameter(response, "response");
            Stream stream = response.getCredentialEntries().stream();
            final Function1 function1 = new Function1() { // from class: androidx.credentials.provider.utils.m1
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return BeginGetCredentialUtil.Companion.convertToJetpackResponse$lambda$0((android.service.credentials.CredentialEntry) obj);
                }
            };
            Stream map = stream.map(new Function() { // from class: androidx.credentials.provider.utils.o1
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return BeginGetCredentialUtil.Companion.convertToJetpackResponse$lambda$1(function1, obj);
                }
            });
            final Function1 function2 = new Function1() { // from class: androidx.credentials.provider.utils.p1
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(BeginGetCredentialUtil.Companion.convertToJetpackResponse$lambda$2((CredentialEntry) obj));
                }
            };
            Stream streamFilter = map.filter(new Predicate() { // from class: androidx.credentials.provider.utils.q1
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return BeginGetCredentialUtil.Companion.convertToJetpackResponse$lambda$3(function2, obj);
                }
            });
            final Function1 function3 = new Function1() { // from class: androidx.credentials.provider.utils.r1
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return BeginGetCredentialUtil.Companion.convertToJetpackResponse$lambda$4((CredentialEntry) obj);
                }
            };
            Object objCollect = streamFilter.map(new Function() { // from class: androidx.credentials.provider.utils.s1
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return BeginGetCredentialUtil.Companion.convertToJetpackResponse$lambda$5(function3, obj);
                }
            }).collect(Collectors.toList());
            Intrinsics.checkNotNullExpressionValue(objCollect, "collect(...)");
            List list = (List) objCollect;
            Stream stream2 = response.getActions().stream();
            final Function1 function4 = new Function1() { // from class: androidx.credentials.provider.utils.t1
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return BeginGetCredentialUtil.Companion.convertToJetpackResponse$lambda$6((Action) obj);
                }
            };
            Stream map2 = stream2.map(new Function() { // from class: androidx.credentials.provider.utils.u1
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return BeginGetCredentialUtil.Companion.convertToJetpackResponse$lambda$7(function4, obj);
                }
            });
            final Function1 function5 = new Function1() { // from class: androidx.credentials.provider.utils.d1
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(BeginGetCredentialUtil.Companion.convertToJetpackResponse$lambda$8((androidx.credentials.provider.Action) obj));
                }
            };
            Stream streamFilter2 = map2.filter(new Predicate() { // from class: androidx.credentials.provider.utils.e1
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return BeginGetCredentialUtil.Companion.convertToJetpackResponse$lambda$9(function5, obj);
                }
            });
            final Function1 function6 = new Function1() { // from class: androidx.credentials.provider.utils.f1
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return BeginGetCredentialUtil.Companion.convertToJetpackResponse$lambda$10((androidx.credentials.provider.Action) obj);
                }
            };
            Object objCollect2 = streamFilter2.map(new Function() { // from class: androidx.credentials.provider.utils.g1
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return BeginGetCredentialUtil.Companion.convertToJetpackResponse$lambda$11(function6, obj);
                }
            }).collect(Collectors.toList());
            Intrinsics.checkNotNullExpressionValue(objCollect2, "collect(...)");
            List list2 = (List) objCollect2;
            Stream stream3 = response.getAuthenticationActions().stream();
            final Function1 function7 = new Function1() { // from class: androidx.credentials.provider.utils.h1
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return BeginGetCredentialUtil.Companion.convertToJetpackResponse$lambda$12((Action) obj);
                }
            };
            Stream map3 = stream3.map(new Function() { // from class: androidx.credentials.provider.utils.i1
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return BeginGetCredentialUtil.Companion.convertToJetpackResponse$lambda$13(function7, obj);
                }
            });
            final Function1 function8 = new Function1() { // from class: androidx.credentials.provider.utils.j1
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(BeginGetCredentialUtil.Companion.convertToJetpackResponse$lambda$14((AuthenticationAction) obj));
                }
            };
            Stream streamFilter3 = map3.filter(new Predicate() { // from class: androidx.credentials.provider.utils.k1
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return BeginGetCredentialUtil.Companion.convertToJetpackResponse$lambda$15(function8, obj);
                }
            });
            final Function1 function9 = new Function1() { // from class: androidx.credentials.provider.utils.l1
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return BeginGetCredentialUtil.Companion.convertToJetpackResponse$lambda$16((AuthenticationAction) obj);
                }
            };
            Object objCollect3 = streamFilter3.map(new Function() { // from class: androidx.credentials.provider.utils.n1
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return BeginGetCredentialUtil.Companion.convertToJetpackResponse$lambda$17(function9, obj);
                }
            }).collect(Collectors.toList());
            Intrinsics.checkNotNullExpressionValue(objCollect3, "collect(...)");
            List list3 = (List) objCollect3;
            android.service.credentials.RemoteEntry remoteCredentialEntry = response.getRemoteCredentialEntry();
            if (remoteCredentialEntry != null) {
                RemoteEntry.Companion companion = RemoteEntry.INSTANCE;
                Slice slice = remoteCredentialEntry.getSlice();
                Intrinsics.checkNotNullExpressionValue(slice, "getSlice(...)");
                remoteEntryFromSlice = companion.fromSlice(slice);
            } else {
                remoteEntryFromSlice = null;
            }
            return new androidx.credentials.provider.BeginGetCredentialResponse(list, list2, list3, remoteEntryFromSlice);
        }
    }
}
