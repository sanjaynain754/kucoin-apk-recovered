package com.google.firebase.platforminfo;

import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.components.Dependency;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class DefaultUserAgentPublisher implements UserAgentPublisher {
    private final GlobalLibraryVersionRegistrar gamesSDKRegistrar;
    private final String javaSDKVersionUserAgent;

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ UserAgentPublisher m13847a(ComponentContainer componentContainer) {
        return new DefaultUserAgentPublisher(componentContainer.setOf(LibraryVersion.class), GlobalLibraryVersionRegistrar.getInstance());
    }

    public static Component<UserAgentPublisher> component() {
        return Component.builder(UserAgentPublisher.class).add(Dependency.setOf((Class<?>) LibraryVersion.class)).factory(new ComponentFactory() { // from class: com.google.firebase.platforminfo.a
            @Override // com.google.firebase.components.ComponentFactory
            public final Object create(ComponentContainer componentContainer) {
                return DefaultUserAgentPublisher.m13847a(componentContainer);
            }
        }).build();
    }

    private static String toUserAgent(Set<LibraryVersion> set) {
        StringBuilder sb2 = new StringBuilder();
        Iterator<LibraryVersion> it = set.iterator();
        while (it.hasNext()) {
            LibraryVersion next = it.next();
            sb2.append(next.getLibraryName());
            sb2.append('/');
            sb2.append(next.getVersion());
            if (it.hasNext()) {
                sb2.append(' ');
            }
        }
        return sb2.toString();
    }

    @Override // com.google.firebase.platforminfo.UserAgentPublisher
    public String getUserAgent() {
        if (this.gamesSDKRegistrar.getRegisteredVersions().isEmpty()) {
            return this.javaSDKVersionUserAgent;
        }
        return this.javaSDKVersionUserAgent + ' ' + toUserAgent(this.gamesSDKRegistrar.getRegisteredVersions());
    }

    public DefaultUserAgentPublisher(Set<LibraryVersion> set, GlobalLibraryVersionRegistrar globalLibraryVersionRegistrar) {
        this.javaSDKVersionUserAgent = toUserAgent(set);
        this.gamesSDKRegistrar = globalLibraryVersionRegistrar;
    }
}
