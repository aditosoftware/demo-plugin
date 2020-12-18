package de.adito;

import de.adito.aditoweb.common.jdito.plugin.IPluginFacade;
import de.adito.aditoweb.common.jdito.plugin.PluginException;
import de.adito.aditoweb.common.jdito.plugin.impl.AbstractPlugin;

/**
 * .
 *
 * @author d.buechler, 05.11.2020.
 */
public class DemoPlugin extends AbstractPlugin
{
    public String getDescription()
    {
        return "Demo Plugin";
    }

    public void initStatic()
    {

    }

    public void init()
    {

    }

    @Override
    public Object[] execute(Object[] objects, IPluginFacade iPluginFacade) throws PluginException
    {

        return new Object[]{"Erfolgreiche Pluginausführung"};
    }
}
