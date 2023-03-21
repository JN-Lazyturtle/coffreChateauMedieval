package test;

import static org.junit.Assert.*;

import coffre.Coffre;
import coffre.CoffreFacade;
import coffre.I_CoffreChateau;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CoffreTest {
	
	private I_CoffreChateau coffre;

	@Before
	public void setUp() throws Exception {
		coffre = new CoffreFacade(new Coffre());
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAuDemarrage() {
		assertEquals("CacheParBibliotheque",coffre.nomEtat());
		assertFalse(coffre.chienEstLibere());
		assertFalse(coffre.lapinEstLibere());
	}

	@Test
	public void testApresAvoirOteLeLivreDeLaBibliotheque() {
		coffre.oterLivre();
		assertEquals("Ferme",coffre.nomEtat());
		assertFalse(coffre.chienEstLibere());
		assertFalse(coffre.lapinEstLibere());
	}
	
	@Test
	public void testApresAvoirRemisLeLivreDansLaBibliothequeSansAvoirTouchePrealablementALaChandelle() {
		coffre.oterLivre();
		coffre.remettreLivre();
		assertEquals("CacheParBibliotheque",coffre.nomEtat());
		assertFalse(coffre.chienEstLibere());
		assertFalse(coffre.lapinEstLibere());
	}

	@Test
	public void testApresAvoirOteLivreEtTourneChandelleUneFoisDroite() {
		coffre.oterLivre();
		coffre.tournerChandelleVersDroite();
		assertEquals("PresqueOuvert",coffre.nomEtat());
		assertTrue(coffre.chienEstLibere());
		assertFalse(coffre.lapinEstLibere());
	}

	@Test
	public void testApresAvoirOteLivreEtTourneChandelleDeuxFoisDroite() {
		coffre.oterLivre();
		coffre.tournerChandelleVersDroite();
		coffre.tournerChandelleVersDroite();
		assertEquals("Ouvert",coffre.nomEtat());
		assertTrue(coffre.chienEstLibere());
		assertFalse(coffre.lapinEstLibere());
	}

	@Test
	public void testApresAvoirOteLivreEtTourneChandelleUneFoisGauche() {
		coffre.oterLivre();
		coffre.tournerChandelleVersGauche();
		assertEquals("Bloque",coffre.nomEtat());
		assertFalse(coffre.chienEstLibere());
		assertTrue(coffre.lapinEstLibere());
	}

	@Test
	public void testApresAvoirOteLivreEtTourneChandelleUneFoisDroiteUneFoisGauche() {
		coffre.oterLivre();
		coffre.tournerChandelleVersDroite();
		coffre.tournerChandelleVersGauche();
		assertEquals("Bloque",coffre.nomEtat());
		assertTrue(coffre.chienEstLibere());
		assertTrue(coffre.lapinEstLibere());
	}

	@Test
	public void testApresAvoirOteLivreEtTourneChandelleDeuxFoisDroiteEtFermeCoffre() {
		coffre.oterLivre();
		coffre.tournerChandelleVersDroite();
		coffre.tournerChandelleVersDroite();
		coffre.fermerCoffre();
		assertEquals("Ferme",coffre.nomEtat());
		assertTrue(coffre.chienEstLibere());
		assertFalse(coffre.lapinEstLibere());
	}

	@Test
	public void testApresAvoirOteLivreEtTourneChandelleDeuxFoisDroiteEtFermeCoffreEtRemettreLivre() {
		coffre.oterLivre();
		coffre.tournerChandelleVersDroite();
		coffre.tournerChandelleVersDroite();
		coffre.fermerCoffre();
		coffre.remettreLivre();
		assertEquals("CacheParBibliotheque",coffre.nomEtat());
		assertFalse(coffre.chienEstLibere());
		assertFalse(coffre.lapinEstLibere());
	}

	@Test
	public void testApresAvoirOteLivreEtTourneChandelleUneFoisGaucheEtTourneChandelleUneFoisDroite() {
		coffre.oterLivre();
		coffre.tournerChandelleVersGauche();
		coffre.tournerChandelleVersDroite();
		assertEquals("Bloque",coffre.nomEtat());
		assertFalse(coffre.chienEstLibere());
		assertTrue(coffre.lapinEstLibere());
	}

	@Test
	public void testApresAvoirOteLivreEtTourneChandelleUneFoisDroiteUneFoisGaucheEtTourneChandelleUneFoisDroite() {
		coffre.oterLivre();
		coffre.tournerChandelleVersDroite();
		coffre.tournerChandelleVersGauche();
		coffre.tournerChandelleVersDroite();
		assertEquals("Bloque",coffre.nomEtat());
		assertTrue(coffre.chienEstLibere());
		assertTrue(coffre.lapinEstLibere());
	}

	@Test
	public void testApresAvoirOteLivreEtTourneChandelleUneFoisGaucheEtRemettreLivre() {
		coffre.oterLivre();
		coffre.tournerChandelleVersGauche();
		coffre.remettreLivre();
		assertEquals("Bloque",coffre.nomEtat());
		assertFalse(coffre.chienEstLibere());
		assertTrue(coffre.lapinEstLibere());
	}

	@Test
	public void testApresAvoirOteLivreEtTourneChandelleDeuxFoisDroiteEtTourneChandelleUneFoisGauche() {
		coffre.oterLivre();
		coffre.tournerChandelleVersDroite();
		coffre.tournerChandelleVersDroite();
		coffre.tournerChandelleVersGauche();
		assertEquals("Ouvert",coffre.nomEtat());
		assertTrue(coffre.chienEstLibere());
		assertFalse(coffre.lapinEstLibere());
	}

	@Test
	public void testAuDemarrageEtTourneChandelleUneFoisDroite() {
		coffre.tournerChandelleVersDroite();
		assertEquals("CacheParBibliotheque",coffre.nomEtat());
		assertFalse(coffre.chienEstLibere());
		assertFalse(coffre.lapinEstLibere());
	}

	@Test
	public void testApresAvoirOteLivreEtTourneChandelleUneFoisGaucheEtRemettreLivreEtOterLivre() {
		coffre.oterLivre();
		coffre.tournerChandelleVersGauche();
		coffre.remettreLivre();
		coffre.oterLivre();
		assertEquals("Bloque",coffre.nomEtat());
		assertFalse(coffre.chienEstLibere());
		assertTrue(coffre.lapinEstLibere());
	}

	@Test
	public void testApresAvoirOteLivreEtTourneChandelleUneFoisGaucheEtFermeCoffre() {
		coffre.oterLivre();
		coffre.tournerChandelleVersGauche();
		coffre.fermerCoffre();
		assertEquals("Bloque",coffre.nomEtat());
		assertFalse(coffre.chienEstLibere());
		assertTrue(coffre.lapinEstLibere());
	}
}
