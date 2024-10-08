import { Routes } from '@angular/router';

const routes: Routes = [
  {
    path: 'authority',
    data: { pageTitle: 'calvaryApiGatewayApp.adminAuthority.home.title' },
    loadChildren: () => import('./admin/authority/authority.routes'),
  },
  {
    path: 'institution',
    data: { pageTitle: 'calvaryApiGatewayApp.institution.home.title' },
    loadChildren: () => import('./institution/institution.routes'),
  },
  {
    path: 'institutional-subscription',
    data: { pageTitle: 'calvaryApiGatewayApp.institutionalSubscription.home.title' },
    loadChildren: () => import('./institutional-subscription/institutional-subscription.routes'),
  },
  /* jhipster-needle-add-entity-route - JHipster will add entity modules routes here */
];

export default routes;
