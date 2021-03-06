package com.thinkbiganalytics.kylo.catalog.rest.model;

/*-
 * #%L
 * kylo-catalog-model
 * %%
 * Copyright (C) 2017 - 2018 ThinkBig Analytics, a Teradata Company
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Nonnull;

/**
 * Describes a connector for rendering it in a UI.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ConnectorPluginDescriptor {

    /**
     * Connector plugin ID (connector type)
     */
    private String pluginId;

    /**
     * UI plugin for creating new data sources
     */
    private UiPlugin dataSourcePlugin;

    /**
     * UI tab plugins for setting data set properties
     */
    private List<ConnectorTab> tabs;

    /**
     * A list of options which describe how UI should be displayed for each option
     * a data source would need
     */
    private List<UiOption> options;

    /**
     * Optional identifier for an object which knows how to map Connector UiOptions to Datasource options
     */
    private String optionsMapperId;

    /**
     * Instructions for creating a NiFi controller service
     */
    private ConnectorPluginNiFiControllerService nifiControllerService;

    /**
     * List of NiFi properties that can be overridden by a data set
     */
    private List<ConnectorPluginNiFiProperties> nifiProperties;

    /**
     *
     */
    public ConnectorPluginDescriptor() {
    }

    /**
     *
     */
    public ConnectorPluginDescriptor(@Nonnull final ConnectorPluginDescriptor other) {
        this.pluginId = other.pluginId;
        this.dataSourcePlugin = (other.dataSourcePlugin != null) ? new UiPlugin(other.dataSourcePlugin) : null;
        this.optionsMapperId = other.optionsMapperId;
        this.nifiControllerService = (other.nifiControllerService != null) ? new ConnectorPluginNiFiControllerService(other.nifiControllerService) : null;

        if (other.tabs != null) {
            tabs = new ArrayList<>(other.tabs.size());
            for (final ConnectorTab tab : other.tabs) {
                tabs.add(new ConnectorTab(tab));
            }
        }

        if (other.options != null) {
            options = new ArrayList<>(other.options.size());
            for (final UiOption option : other.options) {
                options.add(new UiOption(option));
            }
        }

        if (other.nifiProperties != null) {
            nifiProperties = new ArrayList<>(other.nifiProperties.size());
            for (final ConnectorPluginNiFiProperties properties : other.nifiProperties) {
                nifiProperties.add(new ConnectorPluginNiFiProperties(properties));
            }
        }
    }

    public String getPluginId() {
        return pluginId;
    }

    public void setPluginId(String pluginId) {
        this.pluginId = pluginId;
    }

    public UiPlugin getDataSourcePlugin() {
        return dataSourcePlugin;
    }

    public void setDataSourcePlugin(UiPlugin dataSourcePlugin) {
        this.dataSourcePlugin = dataSourcePlugin;
    }

    public List<ConnectorTab> getTabs() {
        return tabs;
    }

    public void setTabs(List<ConnectorTab> tabs) {
        this.tabs = tabs;
    }

    public List<UiOption> getOptions() {
        return options;
    }

    public void setOptions(List<UiOption> options) {
        this.options = options;
    }

    public String getOptionsMapperId() {
        return optionsMapperId;
    }

    public void setOptionsMapperId(String optionsMapperId) {
        this.optionsMapperId = optionsMapperId;
    }

    public ConnectorPluginNiFiControllerService getNifiControllerService() {
        return nifiControllerService;
    }

    public void setNifiControllerService(ConnectorPluginNiFiControllerService nifiControllerService) {
        this.nifiControllerService = nifiControllerService;
    }

    public List<ConnectorPluginNiFiProperties> getNifiProperties() {
        return nifiProperties;
    }

    public void setNifiProperties(List<ConnectorPluginNiFiProperties> nifiProperties) {
        this.nifiProperties = nifiProperties;
    }
}
