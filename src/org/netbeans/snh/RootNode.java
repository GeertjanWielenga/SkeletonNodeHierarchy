package org.netbeans.snh;

import java.beans.IntrospectionException;
import org.netbeans.api.annotations.common.StaticResource;
import org.netbeans.api.core.ide.ServicesTabNodeRegistration;
import org.netbeans.snh.level1.Level1ChildFactory;
import org.openide.nodes.AbstractNode;
import org.openide.nodes.Children;
import org.openide.util.*;

@ServicesTabNodeRegistration(
        displayName = "#CTL_DisplayName", 
        name = "#CTL_DisplayName", 
        iconResource = "org/netbeans/snh/icon.png", 
        shortDescription = "#CTL_DisplayName")
@NbBundle.Messages("CTL_DisplayName=Root")
public class RootNode extends AbstractNode {
    
    @StaticResource
    private static final String ICON = "org/netbeans/snh/icon.png";
    
    public RootNode() throws IntrospectionException {
        super(Children.create(new Level1ChildFactory(), true));
        setDisplayName(Bundle.CTL_DisplayName());
        setIconBaseWithExtension(ICON);
    }
    
}
