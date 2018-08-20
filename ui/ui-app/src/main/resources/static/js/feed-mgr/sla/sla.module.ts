import {NgModule, CUSTOM_ELEMENTS_SCHEMA} from "@angular/core";

import {MatButtonModule} from "@angular/material/button";
import {MatIconModule} from "@angular/material/icon";
import {MatListModule} from "@angular/material/list";
import {MatMenuModule} from "@angular/material/menu";
import {MatInputModule} from '@angular/material/input';
import {MatSelectModule} from '@angular/material/select';
import {MatProgressSpinnerModule} from "@angular/material/progress-spinner";
import {MatGridListModule} from '@angular/material/grid-list';
import {MatDialogModule} from '@angular/material/dialog';

import {MatFormFieldModule} from '@angular/material/form-field';
import {MatCardModule} from '@angular/material/card';
import {MatCheckboxModule} from '@angular/material/checkbox';
import {MatDatepickerModule} from '@angular/material/datepicker';
import {MatSnackBarModule} from '@angular/material/snack-bar';

import {BrowserModule} from "@angular/platform-browser";

import { CovalentCommonModule } from '@covalent/core/common';
import {CovalentLoadingModule} from "@covalent/core/loading";
import {CovalentMenuModule} from "@covalent/core/menu";
import {CovalentNotificationsModule} from "@covalent/core/notifications";
import { CovalentChipsModule } from '@covalent/core/chips';
import { CovalentDialogsModule } from '@covalent/core/dialogs';

import {TranslateModule} from "@ngx-translate/core";
import {CodemirrorModule} from "ng2-codemirror";

import {KyloServicesModule} from "../../services/services.module";
import {KyloCommonModule} from "../../common/common.module";

import { UIRouterModule } from "@uirouter/angular";
import {slaStates} from "./sla.states";

import CategoriesService from "../services/CategoriesService";
import { RestUrlService } from "../services/RestUrlService";
import { FeedSecurityGroups } from "../services/FeedSecurityGroups";
import { EntityAccessControlService } from "../shared/entity-access-control/EntityAccessControlService";
import ServiceLevelAgreementInit from "./ServiceLevelAgreementInit.component";
import ServiceLevelAgreements from "./service-level-agreements.component";
import ServiceLevelAgreementController from "./service-level-agreement.component";
import { SlaService } from "../services/SlaService";
import FeedServiceLevelAgreements from "./feed-service-level-agreements.component";
import ServiceLevelAgreementForm from "./service-level-agreement-form.component";

import { CovalentDataTableModule } from '@covalent/core/data-table';
import { CovalentSearchModule } from '@covalent/core/search';
import { CovalentPagingModule } from '@covalent/core/paging';
import { SlaEmailTemplates } from "./sla-email-templates/SlaEmailTemplates.component";
import SlaEmailTemplateService from "./sla-email-templates/SlaEmailTemplateService";
import { SlaEmailTemplate, testDialogController } from "./sla-email-templates/SlaEmailTemplate.component";
import { PolicyInputFormController } from "../shared/policy-input-form/policy-input-form.component";
// import { CronExpressionPreview } from "../shared/cron-expression-preview/cron-expression-preview.component";
import { FormsModule, ReactiveFormsModule, FormControlDirective } from '@angular/forms';
import {KyloFeedManagerModule} from "../feed-mgr.module";
import * as angular from "angular";

@NgModule({
    declarations: [
        ServiceLevelAgreementInit,
        ServiceLevelAgreements,
        ServiceLevelAgreementController,
        FeedServiceLevelAgreements,
        ServiceLevelAgreementForm,
        SlaEmailTemplates,
        SlaEmailTemplate,
        testDialogController,
        PolicyInputFormController,
        // CronExpressionPreview
    ],
    entryComponents: [
        ServiceLevelAgreementInit,
        ServiceLevelAgreements,
        ServiceLevelAgreementController,
        FeedServiceLevelAgreements,
        ServiceLevelAgreementForm,
        SlaEmailTemplates,
        SlaEmailTemplate,
        testDialogController,
        PolicyInputFormController,
        // CronExpressionPreview
    ],
    imports: [
        CodemirrorModule,
        CovalentCommonModule,
        CovalentLoadingModule,
        CovalentDataTableModule,
        CovalentSearchModule,
        CovalentPagingModule,
        CovalentMenuModule,
        CovalentNotificationsModule,
        CovalentChipsModule,
        CovalentDialogsModule,
        KyloServicesModule,
        KyloCommonModule,
        KyloFeedManagerModule,
        MatButtonModule,
        MatIconModule,
        MatListModule,
        MatMenuModule,
        MatInputModule,
        MatSelectModule,
        MatProgressSpinnerModule,
        MatGridListModule,
        MatDialogModule,
        MatSnackBarModule,
        FormsModule,
        ReactiveFormsModule,
        TranslateModule,
        MatFormFieldModule,
        MatCardModule,
        MatCheckboxModule,
        MatDatepickerModule,
        UIRouterModule.forChild({states: slaStates})
    ],
    schemas: [CUSTOM_ELEMENTS_SCHEMA],
    providers: [
        {provide: "$injector", useFactory: () => angular.element(document.body).injector()},
        SlaService,
        SlaEmailTemplateService
    ]
})
export class SLAModule {
}