package com.bitdubai.fermat_ccp_core.layer.actor.extra_wallet_user;

import com.bitdubai.fermat_api.PluginDeveloper;
import com.bitdubai.fermat_api.layer.all_definition.common.abstract_classes.AbstractSubsystem;
import com.bitdubai.fermat_api.layer.all_definition.common.exceptions.CantStartSubsystemException;
import com.bitdubai.fermat_ccp_plugin.layer.actor.extra_user.developer.bitdubai.DeveloperBitDubai;

/**
 * Created by Leon Acosta - (laion.cj91@gmail.com) on 22/09/2015.
 *
 * @version 1.0
 * @since Java JDK 1.7
 */
public class ExtraWalletUserSubsystem extends AbstractSubsystem {

    @Override
    public void start() throws CantStartSubsystemException {
        try {
            PluginDeveloper developer = new DeveloperBitDubai();
            plugin = developer.getPlugin();
        } catch (Exception e) {
            System.err.println("Exception: " + e.getMessage());
            throw new CantStartSubsystemException(e, null, null);
        }
    }
}
